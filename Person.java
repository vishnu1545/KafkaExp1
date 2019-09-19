package com.example.kafka.springbootkafkaproducerexample.model;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person {
private Integer personId;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd 'T' HH:mm:ss")
private Date timeStamp;
private Integer heartRate;
public Integer getPersonId() {
	return personId;
}
public void setPersonId(Integer personId) {
	this.personId = personId;
}

public Integer getHeartRate() {
	return heartRate;
}
public void setHeartRate(Integer heartRate) {
	this.heartRate = heartRate;
}
public Date getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(Date timeStamp) {
	this.timeStamp = timeStamp;
}

}
