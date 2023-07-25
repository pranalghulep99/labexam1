FROM openjdk:latest

WORKDIR /app2

COPY . /app2

RUN javac GreatestNumber.java

CMD ["java", "GreatestNumber"]