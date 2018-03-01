reset
konsole --noclose -e sh /home/demo/iot/hello_kafka_streams/run_wiki_topics.sh


export PATH=/sbin:/usr/local/sbin:/usr/bin:/bin:/usr/sbin:/sbin:/root/bin:/opt/jdk1.8.0_161/bin:/opt/apache-maven-3.2.2/bin:/opt/gradle-3.4.1/bin
export JAVA_HOME=/opt/jdk1.8.0_161/
cd /home/demo/iot/hello_kafka_streams/hello-kafka-streams/
./gradlew build
/home/demo/iot/hello_kafka_streams/hello-kafka-streams/build/scripts/hello-kafka-streams 
