package com.producer.config;

import java.util.HashMap;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class KafkaConfig {
	
	
	@Bean
	public NewTopic topic()
	{
		return TopicBuilder.name(AppConstants.TOPIC_NAME).build();
	}
	
	@Bean
	public JsonSerializer<HashMap<String, Object>> hashMapJsonSerializer() {
	    return new JsonSerializer<>();
	}
	
//	@Bean
//	public ProducerFactory<String, HashMap<String, Object>> producerFactory(JsonSerializer<HashMap<String, Object>> hashMapJsonSerializer) {
//	    Map<String, Object> configProps = new HashMap<>();
//	    // Add Kafka producer configuration properties here
//	    return new DefaultKafkaProducerFactory<>(configProps, new StringSerializer(), hashMapJsonSerializer);
//	}
//	
//	@Bean
//	public KafkaTemplate<String, HashMap<String, Object>> kafkaTemplate(ProducerFactory<String, HashMap<String, Object>> producerFactory) {
//	    return new KafkaTemplate<>(producerFactory);
//	}
}
