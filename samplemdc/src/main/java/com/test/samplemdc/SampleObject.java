package com.test.samplemdc;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sampleObject")
public class SampleObject {

	private String line;
	private Integer number;
	private Double doubleValue;
	private BigDecimal decimalValue;
	
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getDoubleValue() {
		return doubleValue;
	}
	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}
	public BigDecimal getDecimalValue() {
		return decimalValue;
	}
	public void setDecimalValue(BigDecimal decimalValue) {
		this.decimalValue = decimalValue;
	}

}
