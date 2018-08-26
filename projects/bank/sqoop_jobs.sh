hadoop fs -rm -r /bank
hadoop fs -mkdir /bank

sqoop job --delete loan_info_job
sqoop job --delete credit_card_info_job 
sqoop job --delete shares_info_job

export HADOOP_CLASSPATH=$HADOOP_CLASSPATH:libjars/

sqoop job --create loan_info_job \
-- \
import --connect 'jdbc:mysql://localhost/bank?autoReconnect=true&useSSL=false' \
--username 'myuser' \
--password-file 'file:///Users/meraj/Development/Hadoop/projects/bank/sqoop_password' \
--bindir ./libjars \
--table 'loan_info' \
--target-dir '/bank/loan_info_stg' \
--incremental append \
--check-column loan_id \
--m 1;

sqoop job --create credit_card_info_job \
-- \
import --connect 'jdbc:mysql://localhost/bank?autoReconnect=true&useSSL=false' \
--username 'myuser' \
--password-file 'file:///Users/meraj/Development/Hadoop/projects/bank/sqoop_password' \
--bindir ./libjars \
--table 'credit_card_info' \
--target-dir '/bank/credit_card_info_stg' \
--incremental append \
--check-column cc_number \
-m 1;

sqoop job --create shares_info_job \
-- \
import --connect 'jdbc:mysql://localhost/bank?autoReconnect=true&useSSL=false' \
--username 'myuser' \
--password-file 'file:///Users/meraj/Development/Hadoop/projects/bank/sqoop_password' \
--bindir ./libjars \
--table 'shares_info' \
--target-dir '/bank/shares_info_stg' \
-m 1;

sqoop job --list

sqoop job --exec loan_info_job
sqoop job --exec credit_card_info_job
sqoop job --exec shares_info_job 

hadoop fs -cat "/bank/loan_info_stg/*"
hadoop fs -cat "/bank/credit_card_info_stg/*"
hadoop fs -cat "/bank/shares_info_stg/*"

