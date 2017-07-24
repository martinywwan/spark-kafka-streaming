package com.martinywwan.kafka

import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Duration, StreamingContext}

/**
  * Subscribes to Kafka topics using Spark streaming
  * Created by Martin (Yew Wing) Wan
  */
class KafkaStream {
  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("KafkaStreamingUsingSpark").set("spark.driver.allowMultipleContexts", "true")
  val sparkStreamingContext = new StreamingContext(sparkConf, Duration.apply(10000)) //10 second intervals
//  sparkStreamingContext.checkpoint("checkpoint") --checkpoint location

  /**
    * Subscribe to real-time Kafka messages
    */
  def getRealTimeKafkaMessages(topicMap : Map[String,Int]) = {
    //createSteam(streamingContext, zookeeper , consumer group id, topics)
    var lines = KafkaUtils.createStream(sparkStreamingContext, "localhost:2181", "kafka-streaming-subscribing-example", topicMap)
    lines.map(line => line._2).print()

    sparkStreamingContext.start()
    sparkStreamingContext.awaitTermination()
  }
}
