Near real-time streaming using Apache Spark and Apache Kafka <br />
=============
<br />

## Synopsis <br />
---------------
<br />
A basic Apache Spark Streaming application <br /> 
<br />

## Motivation <br /> 
---------------
<br />
The motivation behind this project was to provide support to developers and researchers in using Apache Spark Streaming with Apache Kafka. <br />
<br />

## Execution <br />
---------------
<br />
Prerequisites: <br />
1) Ensure Hadoop is setup i.e. ${HADOOP_CONF_DIR} and ${HADOOP_HOME} are set <br />
2)${HADOOP_HOME}/bin/winutils.exe must exist otherwise you will get the error _Failed to locate the winutils binary in the hadoop binary path_ <br />
3) Ensure Kafka is setup (https://kafka.apache.org/quickstart) <br />
<br />
Instructions to run: <br />
1) Zookeeper is required for Kafka - Run an instance of it: ${kafka_dir}/bin/zookeeper-server-start.sh ${kafka_dir}/config/zookeeper.properties <br />
2) Start Kafka - In this case we will run 1 node: ${kafka_dir}/bin/kafka-server-start.sh ${kafka_dir}/config/server.properties (to run multiple brokers/nodes, run with unique server.properties i.e. unique broker.id and log.dirs) <br />
3) Run the spark-kafka-streaming application either through IDE or execute on a new Shell <br />
4) In a new Shell, open the Kafka console producer: ${kafka_dir}/bin/kafka-console-producer.sh --broker-list [ip/localhost]:[port-default_is_9092] --topic [topic_name]  <br />
