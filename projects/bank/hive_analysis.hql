ADD JAR /Users/meraj/Development/Hadoop/projects/bank/hive_udf/hive-udf.jar;
CREATE TEMPORARY FUNCTION encrypt AS 'encryption.AESencrypt';
CREATE TEMPORARY FUNCTION decrypt AS 'encryption.AESdecrypt';
CREATE TEMPORARY FUNCTION max_profit AS 'maxprofit.MaxProfit';

SET hive.auto.convert.join=false;

USE bank;

SELECT decrypt(user_id)
FROM loan_info
WHERE datediff(from_unixtime(unix_timestamp(), 'yyyy-MM-dd'), decrypt(last_payment_date)) >= 60;

SELECT decrypt(li.user_id)
FROM loan_info li INNER JOIN credit_card_info cci
ON decrypt(li.user_id) = decrypt(cci.user_id)
WHERE CAST(decrypt(cci.outstanding_balance) AS double) = 0.0
AND datediff(from_unixtime(unix_timestamp(), 'yyyy-MM-dd'), decrypt(li.last_payment_date)) >= 30;
