package com.cts.starter.pojo;

import java.sql.Time;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Stockprice")
public class Stockprice {

@Id

 private String companycode;

 @Override

 public String toString() {

 return "StockPrice [companycode=" + companycode + ", stockexchange=" + stockexchange + ", currentprice="

  + currentprice + ", date=" + date + ", time=" + time + "]";

 }

 private String stockexchange;

  private String currentprice;

  private Date date;

  private Time time;



 public String getCompanycode() {

 return companycode;

 }

 public void setCompanycode(String companycode) {

 this.companycode = companycode;

 }

 public String getStockexchange() {

 return stockexchange;

 }

 public void setStockexchange(String stockexchange) {

 this.stockexchange = stockexchange;

 }

 public String getCurrentprice() {

 return currentprice;

 }

 public void setCurrentprice(String currentprice) {

 this.currentprice = currentprice;

 }

 public Date getDate() {

 return date;

 }

 public void setDate(Date date) {

 this.date = date;

 }

 public Time getTime() {

 return time;

 }

 public void setTime(Time time) {

 this.time = time;

 }



}

