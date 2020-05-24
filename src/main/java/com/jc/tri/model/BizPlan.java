package com.jc.tri.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BizPlan implements Serializable {

	@Column(name = "planKey")
	String planKey;
	
	@Column(name = "platKey")
	String platKey;
	
	@Column(name = "planNm")
	String planNm;
	
	@Column(name = "useYn")
	String useYn;
	
	@Column(name = "defaultYn")
	String defaultYn;
	
	@Column(name = "price")
	String price;
	
	@Column(name = "connLimit")
	String connLimit;
	
	@Column(name = "dataLimit")
	String dataLimit;
	
	@Column(name = "createUserYn")
	String createUserYn;
	
	@Column(name = "controlYn")
	String controlYn;
	
	@Column(name = "appYn")
	String appYn;
	
	@Column(name = "devDetailYn")
	String devDetailYn;
	
	@Column(name = "apiLinkYn")
	String apiLinkYn;
	
	@Column(name = "pushYn")
	String pushYn;
	
	@Column(name = "customPushYn")
	String customPushYn;
	
	@Column(name = "customLogoYn")
	String customLogoYn;
	
	@Column(name = "memo")
	String memo;
	
	@Column(name = "regDt")
	Date regDt;
	
	@Column(name = "updDt")
	Date updDt;
	
	public String getPlanKey() {
		return planKey;
	}
	public void setPlanKey(String planKey) {
		this.planKey = planKey;
	}
	public String getPlatKey() {
		return platKey;
	}
	public void setPlatKey(String platKey) {
		this.platKey = platKey;
	}
	public String getPlanNm() {
		return planNm;
	}
	public void setPlanNm(String planNm) {
		this.planNm = planNm;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getDefaultYn() {
		return defaultYn;
	}
	public void setDefaultYn(String defaultYn) {
		this.defaultYn = defaultYn;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getConnLimit() {
		return connLimit;
	}
	public void setConnLimit(String connLimit) {
		this.connLimit = connLimit;
	}
	public String getDataLimit() {
		return dataLimit;
	}
	public void setDataLimit(String dataLimit) {
		this.dataLimit = dataLimit;
	}
	public String getCreateUserYn() {
		return createUserYn;
	}
	public void setCreateUserYn(String createUserYn) {
		this.createUserYn = createUserYn;
	}
	public String getControlYn() {
		return controlYn;
	}
	public void setControlYn(String controlYn) {
		this.controlYn = controlYn;
	}
	public String getAppYn() {
		return appYn;
	}
	public void setAppYn(String appYn) {
		this.appYn = appYn;
	}
	public String getDevDetailYn() {
		return devDetailYn;
	}
	public void setDevDetailYn(String devDetailYn) {
		this.devDetailYn = devDetailYn;
	}
	public String getApiLinkYn() {
		return apiLinkYn;
	}
	public void setApiLinkYn(String apiLinkYn) {
		this.apiLinkYn = apiLinkYn;
	}
	public String getPushYn() {
		return pushYn;
	}
	public void setPushYn(String pushYn) {
		this.pushYn = pushYn;
	}
	public String getCustomPushYn() {
		return customPushYn;
	}
	public void setCustomPushYn(String customPushYn) {
		this.customPushYn = customPushYn;
	}
	public String getCustomLogoYn() {
		return customLogoYn;
	}
	public void setCustomLogoYn(String customLogoYn) {
		this.customLogoYn = customLogoYn;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	public Date getUpdDt() {
		return updDt;
	}
	public void setUpdDt(Date updDt) {
		this.updDt = updDt;
	}
	
	@Override
	public String toString() {
		return "BizPlan [planKey=" + planKey + ", platKey=" + platKey + ", planNm=" + planNm + ", useYn=" + useYn
				+ ", defaultYn=" + defaultYn + ", price=" + price + ", connLimit=" + connLimit + ", dataLimit="
				+ dataLimit + ", createUserYn=" + createUserYn + ", controlYn=" + controlYn + ", appYn=" + appYn
				+ ", devDetailYn=" + devDetailYn + ", apiLinkYn=" + apiLinkYn + ", pushYn=" + pushYn + ", customPushYn="
				+ customPushYn + ", customLogoYn=" + customLogoYn + ", memo=" + memo + ", regDt=" + regDt + ", updDt="
				+ updDt + "]";
	}
	
	
}
