Step 1: Start Zookeeper

    $ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
    
Step 2: Start Kafka server

    $ kafka-server-start /usr/local/etc/kafka/server.properties
    
Step 3: Start spring_boot_kafka

    $ kafka-console-consumer --bootstrap-server localhost:9092 --topic channel --from-beginning

Step 4: Start spring_boot_kafka

    $ gradle bootRun
    
Step 4: Test Kafka

    $ curl http://localhost:9000/kafka/publish/pewdiepie
    
    Messages will be printed in kafka-console-consumer