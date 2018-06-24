package com.onlineshopping.po;

import java.util.Date;

public class Goods {
	int gdID;
	int tID;
	int gdCode;		
	String gdName;	//����
	float gdPrice;  //�۸�
	int gdQuantity;
	int gdSaleQty;  //������
	String gdCity;
	String gdInfo;
	Date gdAddTime;
	int gdHot;
	String gdImage;
	String gdAuthir;
	String gdPress;
	int gdIsbn;
	String gdDescribe;
	@Override
	public String toString() {
		return "Goods [gdID=" + gdID + ", tID=" + tID + ", gdCode=" + gdCode + ", gdName=" + gdName + ", gdPrice="
				+ gdPrice + ", gdQuantity=" + gdQuantity + ", gdSaleQty=" + gdSaleQty + ", gdCity=" + gdCity
				+ ", gdInfo=" + gdInfo + ", gdAddTime=" + gdAddTime + ", gdHot=" + gdHot + ", gdImage=" + gdImage
				+ ", gdAuthir=" + gdAuthir + ", gdPress=" + gdPress + ", gdIsbn=" + gdIsbn + ", gdDescribe="
				+ gdDescribe + "]";
	}
	public int getGdID() {
		return gdID;
	}
	public void setGdID(int gdID) {
		this.gdID = gdID;
	}
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public int getGdCode() {
		return gdCode;
	}
	public void setGdCode(int gdCode) {
		this.gdCode = gdCode;
	}
	public String getGdName() {
		return gdName;
	}
	public void setGdName(String gdName) {
		this.gdName = gdName;
	}
	public float getGdPrice() {
		return gdPrice;
	}
	public void setGdPrice(float gdPrice) {
		this.gdPrice = gdPrice;
	}
	public int getGdQuantity() {
		return gdQuantity;
	}
	public void setGdQuantity(int gdQuantity) {
		this.gdQuantity = gdQuantity;
	}
	public int getGdSaleQty() {
		return gdSaleQty;
	}
	public void setGdSaleQty(int gdSaleQty) {
		this.gdSaleQty = gdSaleQty;
	}
	public String getGdCity() {
		return gdCity;
	}
	public void setGdCity(String gdCity) {
		this.gdCity = gdCity;
	}
	public String getGdInfo() {
		return gdInfo;
	}
	public void setGdInfo(String gdInfo) {
		this.gdInfo = gdInfo;
	}
	public Date getGdAddTime() {
		return gdAddTime;
	}
	public void setGdAddTime(Date gdAddTime) {
		this.gdAddTime = gdAddTime;
	}
	public int getGdHot() {
		return gdHot;
	}
	public void setGdHot(int gdHot) {
		this.gdHot = gdHot;
	}
	public String getGdImage() {
		return gdImage;
	}
	public void setGdImage(String gdImage) {
		this.gdImage = gdImage;
	}
	public String getGdAuthir() {
		return gdAuthir;
	}
	public void setGdAuthir(String gdAuthir) {
		this.gdAuthir = gdAuthir;
	}
	public String getGdPress() {
		return gdPress;
	}
	public void setGdPress(String gdPress) {
		this.gdPress = gdPress;
	}
	public int getGdIsbn() {
		return gdIsbn;
	}
	public void setGdIsbn(int gdIsbn) {
		this.gdIsbn = gdIsbn;
	}
	public String getGdDescribe() {
		return gdDescribe;
	}
	public void setGdDescribe(String gdDescribe) {
		this.gdDescribe = gdDescribe;
	}
	
}
