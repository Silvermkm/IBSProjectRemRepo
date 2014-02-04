package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Surcharge")
@XmlAccessorType(XmlAccessType.FIELD)
public class Surcharge {
	
	@XmlAttribute(name = "type")
	String type;
	
	@XmlAttribute(name = "amount")
	String amount;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
