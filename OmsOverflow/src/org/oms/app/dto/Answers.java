package org.oms.app.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answers {
	
@Id
int id;
private String answer;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
