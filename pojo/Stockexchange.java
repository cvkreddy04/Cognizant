package com.cts.starter.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stockexchange")
public class Stockexchange {

	@Id

	private int id;

	private String stock_exchange;

	private String brief;

	private String remarks;

	private String contact_address;

	@Override

	public String toString() {

		return "StockExchange [id=" + id + ", stock_exchange=" + stock_exchange + ", brief=" + brief + ", remarks="

				+ remarks + ", contact_address=" + contact_address + "]";

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getStock_exchange() {

		return stock_exchange;

	}

	public void setStock_exchange(String stock_exchange) {

		this.stock_exchange = stock_exchange;

	}

	public String getBrief() {

		return brief;

	}

	public void setBrief(String brief) {

		this.brief = brief;

	}

	public String getRemarks() {

		return remarks;

	}

	public void setRemarks(String remarks) {

		this.remarks = remarks;

	}

	public String getContact_address() {

		return contact_address;

	}

	public void setContact_address(String contact_address) {

		this.contact_address = contact_address;

	}

}
