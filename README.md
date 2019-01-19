Step 1: Start Zookeeper

    $ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
    
Step 2: Start Kafka server

    $ kafka-server-start /usr/local/etc/kafka/server.properties
    
Step 3: Start spring_boot_kafka

    $ gradle bootRun
    
Step 4: Test Kafka

    $ curl -X POST -F 'message=kafka' http://localhost:9000/kafka/publish