#FROM openjdk:8-jre-alpine
FROM openjdk:8
#FROM 192.168.16.55/sinohealth-aimdt/centos7-jdk-utf8:8_202
#RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
WORKDIR /home/www
COPY security-0.0.1-SNAPSHOT.jar /home/www
CMD ["java","-jar","security-0.0.1-SNAPSHOT.jar"]