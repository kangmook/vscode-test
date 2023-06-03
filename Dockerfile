FROM adoptopenjdk/openjdk11

# timezone 시간을 서울로 설정
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /data1/docroot

COPY target/ROOT.war /data1/docroot/

EXPOSE 8080
ENTRYPOINT ["java","-Dfile.encoding=utf-8", "-jar","/data1/docroot/ROOT.war"]