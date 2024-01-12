# jdk镜像版本
FROM openjdk:8
# 这个路径是在容器里面
WORKDIR /home/docker
COPY security-0.0.1-SNAPSHOT.jar /home/docker
CMD ["java","-jar","security-0.0.1-SNAPSHOT.jar"]

# 把security-0.0.1-SNAPSHOT.jar包和dockerfile放在同一个目录下，执行一下命令
# 构建镜像名为 security,命令: docker build -t security .
# 启动镜像security, 命令: docker run -itd --name spring-security-demo -p 8666:8666 security