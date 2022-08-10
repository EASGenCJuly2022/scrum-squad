package com.productservice.productservice;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class Consumer {
	public static void consumeMessage() 
	{
	     Properties properties = new Properties();
	       String bootstrapServer = "127.0.0.1:9092";

	       properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
	       properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
	       properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
	       properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "grp_id");
	       properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

	       String topic ="product_message";
	       String grp_id = "second";


	       KafkaConsumer<String,String> consumer = new KafkaConsumer<String,String>(properties);
	       consumer.subscribe(Arrays.asList(topic));


	       while(true) {

	           ConsumerRecords<String,String> records = consumer.poll(Duration.ofMillis(100));
	           
	           for(ConsumerRecord<String,String> record :records)
	           {
	               System.out.println("Value of kafka record is " + record.value());
	           }

	       }
	}
}
