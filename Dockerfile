#FROM openjdk:8-jre-alpine
FROM openjdk:8
#FROM 192.168.16.55/sinohealth-aimdt/centos7-jdk-utf8:8_202
#RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
# 这个路径是在容器里面
WORKDIR /home/docker
COPY security-0.0.1-SNAPSHOT.jar /home/docker
CMD ["java","-jar","security-0.0.1-SNAPSHOT.jar"]

# 把security-0.0.1-SNAPSHOT.jar包和dockerfile放在同一个目录下，执行一下命令
# 构建镜像名为 security,命令: docker build -t security .
# 启动镜像security, 命令: docker run -itd --name spring-security-demo -p 8666:8666 security