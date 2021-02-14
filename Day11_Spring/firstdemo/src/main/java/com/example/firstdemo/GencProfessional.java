package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GencProfessional 
{
	private int id;
	private String bu;
	
	@Autowired
	private GencPersonal gencPersonal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public GencPersonal getGencPersonal() {
		return gencPersonal;
	}
	public void setGencPersonal(GencPersonal gencPersonal) {
		this.gencPersonal = gencPersonal;
	}
	
	public void show()
	{
		System.out.println("In professional");
		gencPersonal.personal();
	}

}
