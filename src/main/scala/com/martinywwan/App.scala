package com.martinywwan

import com.martinywwan.kafka.KafkaStream
import org.apache.log4j.{Level, Logger}

/**
  * Simple Spark streaming application to subscribe to Kafka topics
  */
object App {

  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)

  /**Subscribes and publishes to Kafka
    *
    * @param args TODO - define Kafka details
    */
  def main(args: Array[String]): Unit = {
    val kafkastream = new KafkaStream
    kafkastream.getRealTimeKafkaMessages(Map("martin_test_topic" -> 1)) //subscribe to the topic "martin_test_topic" with thread count 1
  }
}
