## Spring Boot Kafka Logging Application

This project implements a microservices architecture using Spring Boot and Apache Kafka for centralized log collection and processing.

### Tech Stack

* **Spring Boot:** Rapid application development framework
* **Java:** Programming language
* **Apache Kafka:** Distributed streaming platform

### Microservices Architecture

The application consists of two microservices:

* **Producer Microservice:**
    * Captures logs from API calls or other sources.
    * Serializes logs as events and publishes them to a designated Kafka topic.
* **Consumer Microservice:**
    * Subscribes to the Kafka topic.
    * Deserializes received events (logs) and displays them to console but can be used with external system (e.g., centralized logging platform, ELK Stack).

### Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-kafka</artifactId>
    </dependency>
</dependencies>


## Installing Apache Kafka

This guide outlines the steps to install Apache Kafka on your system. Here, we'll focus on a single-node installation for development or testing purposes. For production deployments, consider a distributed setup with multiple brokers and ZooKeeper nodes.

**Prerequisites**

* **Java:** Ensure you have Java 8 or later installed. Verify the version using `java -version` in your terminal. If not installed, download and install the Java Development Kit (JDK) from the official website: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/).
* **Operating System:** This guide covers installation on Linux-based systems (Ubuntu, Debian, etc.). For other operating systems, refer to the official Kafka documentation: [https://kafka.apache.org/quickstart](https://kafka.apache.org/quickstart)

**Installation Steps**

Docker: Ensure you have Docker installed and running on your system. Refer to the official Docker documentation for installation instructions: https://docs.docker.com/engine/install/
Steps

1. Pull the Kafka Image: Use the docker pull command to download the official Kafka image from Docker Hub:
docker pull confluentinc/kafka:latest

2. Run the Kafka Container: Launch a Kafka container using docker run:
docker run -d --name my-kafka confluentinc/kafka:latest


