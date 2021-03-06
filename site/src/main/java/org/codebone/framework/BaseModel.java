package org.codebone.framework;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(value=ArrayList.class)
public class BaseModel{
	
	protected Date date = new Date();
	
	protected String message;
	
	protected String code;
	
	//@XmlAnyElement
	//@XmlElement(name = "List")
	protected Object data;
	
	protected boolean hasNext;
	
	protected int allCount;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public int getAllCount() {
		return allCount;
	}

	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}

	public BaseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseModel(Date date, String message, String code, Object data,
			boolean hasNext, int allCount) {
		super();
		this.date = date;
		this.message = message;
		this.code = code;
		this.data = data;
		this.hasNext = hasNext;
		this.allCount = allCount;
	}

	@Override
	public String toString() {
		return "BaseModel [date=" + date + ", message=" + message + ", code="
				+ code + ", data=" + data + ", hasNext=" + hasNext
				+ ", allCount=" + allCount + "]";
	}
}
