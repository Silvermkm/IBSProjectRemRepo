package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Surcharges")
@XmlAccessorType(XmlAccessType.FIELD)
public class Surcharges {
	@XmlAttribute(name = "size")
	Integer size;

	@XmlElement(name = "Surcharge")
	Surcharge surcharge;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Surcharge getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(Surcharge surcharge) {
		this.surcharge = surcharge;
	}

}
