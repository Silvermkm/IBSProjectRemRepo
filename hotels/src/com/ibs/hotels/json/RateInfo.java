package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RateInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class RateInfo {
	
	@XmlAttribute(name = "priceBreakdown")
	String priceBreakdown;
	
	@XmlAttribute(name = "promo")
	String promo;
	
	@XmlAttribute(name = "rateChange")
	String rateChange;
	
	@XmlElement(name = "ChargeableRateInfo")
	ChargeableRateInfo chargeableRateInfo;

	public String getPriceBreakdown() {
		return priceBreakdown;
	}

	public void setPriceBreakdown(String priceBreakdown) {
		this.priceBreakdown = priceBreakdown;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getRateChange() {
		return rateChange;
	}

	public void setRateChange(String rateChange) {
		this.rateChange = rateChange;
	}

	public ChargeableRateInfo getChargeableRateInfo() {
		return chargeableRateInfo;
	}

	public void setChargeableRateInfo(ChargeableRateInfo chargeableRateInfo) {
		this.chargeableRateInfo = chargeableRateInfo;
	}
	
	
}
