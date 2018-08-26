hadoop fs -mkdir /bank
hadoop fs -rm -r /bank

sqoop job --delete loan_info_job
hadoop fs -mkdir /bank/loan_info_stg

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

sqoop job --exec loan_info_job
sqoop job --list

hadoop fs -cat "/bank/loan_info_stg/*"

