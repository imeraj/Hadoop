CREATE DATABASE ecom;
USE ecom;
ADD jar /Users/meraj/Development/Hadoop/projects/e-commerce/json-serde.jar; 

set hive.exec.dynamic.partition.mode=nonstrict;
set hive.auto.convert.join=false;

CREATE TABLE products_info_raw(
id STRING,
name STRING,
reseller STRING,
category STRING,
price STRING,
discount STRING,
profit_percent STRING 
)
PARTITIONED BY (
rptg_dt STRING
)
ROW FORMAT SERDE 'org.openx.data.jsonserde.JsonSerDe';

CREATE TABLE products_info_core(
product_id STRING,
product_name STRING,
reseller STRING,
category STRING,
price BIGINT,
discount FLOAT,
profit_percent FLOAT
)
PARTITIONED BY (
rptg_dt STRING
)
CLUSTERED BY
(
product_id)
INTO 8 BUCKETS
STORED AS ORC;

CREATE TABLE products_info_stg
(
product_id STRING,
product_name STRING,
reseller STRING,
category STRING,
price BIGINT,
discount FLOAT,
profit_percent FLOAT
)
PARTITIONED BY (
rptg_dt STRING
)
CLUSTERED BY (
product_id)
INTO 8 BUCKETS
STORED AS ORC;

CREATE TABLE products_info_excp
(
product_id STRING,
product_name STRING,
reseller STRING,
category STRING,
price BIGINT,
discount FLOAT,
profit_percent FLOAT,
rule_failed STRING
)
PARTITIONED BY (
rptg_dt STRING
)
CLUSTERED BY (
product_id)
INTO 8 BUCKETS
STORED AS ORC;

CREATE TABLE user_activity_raw
(
product_id string,
user_id string,
cancellation string,
return string,
cancellation_reason string,
return_reason string,
order_date string,
shipment_date string,
delivery_date string,
cancellation_date string,
return_date string
)
ROW FORMAT SERDE 'org.openx.data.jsonserde.JsonSerDe';

CREATE TABLE user_activity_stg
(
product_id string,
user_id string,
cancellation string,
return string,
cancellation_reason string,
return_reason string,
order_date string,
shipment_date string,
delivery_date string,
cancellation_date string,
return_date string
)
PARTITIONED BY
(
rptg_Dt STRING
)
CLUSTERED BY (
product_id,
user_id)
INTO 8 BUCKETS
STORED AS ORC;


CREATE TABLE user_activity_excp
(
product_id string,
user_id string,
cancellation string,
return string,
cancellation_reason string,
return_reason string,
order_date string,
shipment_date string,
delivery_date string,
cancellation_date string,
return_date string,
rule_failed STRING 
)
PARTITIONED BY
(
rptg_Dt STRING
)
CLUSTERED BY (
product_id,
user_id)
INTO 8 BUCKETS
STORED AS ORC;

CREATE TABLE user_activity_core
(
product_id string,
user_id string,
cancellation string,
return string,
cancellation_reason string,
return_reason string,
order_date string,
shipment_date string,
delivery_date string,
cancellation_date string,
return_date string
)
PARTITIONED BY
(
rptg_Dt STRING
)
CLUSTERED BY (
product_id,
user_id)
INTO 8 BUCKETS
STORED AS ORC;

CREATE TABLE users_info_raw(
id string,
name string,
location struct<city:string,state:string>,
age bigint,
category string
)
ROW FORMAT SERDE 'org.openx.data.jsonserde.JsonSerDe';

CREATE TABLE users_info_stg(
user_id string,
name string,
location struct<city:string,state:string>,
age bigint,
occupation string
)
PARTITIONED BY
(
rptg_Dt STRING
)
CLUSTERED BY (
user_id)
INTO 8 BUCKETS
STORED AS ORC;

CREATE TABLE users_info_excp(
user_id string,
name string,
location struct<city:string,state:string>,
age bigint,
occupation string,
rule_failed STRING
)
PARTITIONED BY
(
rptg_Dt STRING
)
CLUSTERED BY (
user_id)
INTO 8 BUCKETS
STORED AS ORC;


CREATE TABLE users_info_core(
user_id string,
name string,
location struct<city:string,state:string>,
age bigint,
occupation string
)
PARTITIONED BY
(
rptg_Dt STRING
)
CLUSTERED BY (
user_id)
INTO 8 BUCKETS
STORED AS ORC;


