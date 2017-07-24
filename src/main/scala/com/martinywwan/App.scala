package com.martinywwan

import com.martinywwan.kafka.KafkaStream
import org.apache.log4j.{Level, Logger}

/**
  * Simple Spark streaming application to subscribe to Kafka topics
  * Created by Martin (Yew Wing) Wan
  */
object App {

  Logger.getLogger("org").setLevel(Level.OFF) //remove debug logs
  Logger.getLogger("akka").setLevel(Level.OFF) //remove debug logs

  /**Subscribes to Kafka topics
    * TODO - publish to Kafka, retrieve RDD based on offset
    *
    * @param args TODO - define Kafka details
    */
  def main(args: Array[String]): Unit = {
    val kafkastream = new KafkaStream
    kafkastream.getRealTimeKafkaMessages(Map("martin_test_topic" -> 1)) //subscribe to the topic "martin_test_topic" with thread count 1
  }
}
