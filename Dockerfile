FROM eclipse/ubuntu_gradle
# 设置工作目录
WORKDIR /app

# 复制应用程序的 JAR 文件到容器中
COPY target/testDocker-0.0.1-SNAPSHOT.jar test-docker003.jar
COPY application-pro.yml .


# 暴露应用程序的端口
EXPOSE 8083

# 设置容器启动命令
CMD ["java", "-jar", "test-docker003.jar"]
#ENTRYPOINT ["java", "-jar", "test-docker003.jar"]