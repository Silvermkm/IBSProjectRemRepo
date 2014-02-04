package com.ibs.hotels.json;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "NightlyRatesPerRoom")
@XmlAccessorType(XmlAccessType.FIELD)
public class NightlyRatesPerRoom {
	@XmlAttribute(name = "size")
	String size;
	
	@XmlElement(name = "NightlyRate")
	List<NightlyRate> nightlyRate;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<NightlyRate> getNightlyRate() {
		return nightlyRate;
	}

	public void setNightlyRate(List<NightlyRate> nightlyRate) {
		this.nightlyRate = nightlyRate;
	}
	
	
}
