package com.main.maindriver;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class Producer {
	
	public static void produceMessage()
	{
		Properties properties = new Properties();
		String bootstrapServer = "127.0.0.1:9092";
		
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
		
		KafkaProducer <String, String> firstProducer = new KafkaProducer<String, String>(properties);
		
		ProducerRecord <String, String> record = new ProducerRecord<String, String>("product_message", "inventory updated");
		
		firstProducer.send(record);
		firstProducer.flush();
		firstProducer.close();
	}
}
