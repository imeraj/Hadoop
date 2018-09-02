USE bank;

CREATE TABLE survey_analysis (
survey_date string,
survey_question string,
Rating int,
user_id int,
survey_id string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ',';

hive -e "LOAD DATA LOCAL INPATH '/Users/meraj/Development/Hadoop/projects/bank/survey_files/survey_data' INTO TABLE bank.survey_analysis";
