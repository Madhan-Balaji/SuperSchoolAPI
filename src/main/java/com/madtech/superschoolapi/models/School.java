package com.madtech.superschoolapi.models;

import java.sql.Timestamp;
import java.util.Date;

public class School {

	private String id;
	private String name;
	private String board;
	private Date startedDate;
	private Date joinedDate;
	private String website;
	private double primaryContact;
	private double secondaryContact;
	private String primaryEmail;
	private String secondaryEmail;
	private String languages;
	private boolean kinderGardenAvailable;
	private boolean primaryAvailable;
	private boolean secondaryAvailable;
	private boolean higherSecondaryAvailable;
	private boolean governmentAided;
	private boolean international;
	private boolean smartSchool;
	private String description;
	private String logo;
	private String image1;
	private String image2;
	private String image3;
	private String doorNo;
	private String street;
	private String area;
	private String city;
	private int pincode;
	private String createdBy;
	private String updatedBy;
	private Timestamp createdDateTime;
	private Timestamp updatedDateTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public Date getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public double getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(double primaryContact) {
		this.primaryContact = primaryContact;
	}
	public double getSecondaryContact() {
		return secondaryContact;
	}
	public void setSecondaryContact(double secondaryContact) {
		this.secondaryContact = secondaryContact;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public boolean isKinderGardenAvailable() {
		return kinderGardenAvailable;
	}
	public void setKinderGardenAvailable(boolean kinderGardenAvailable) {
		this.kinderGardenAvailable = kinderGardenAvailable;
	}
	public boolean isPrimaryAvailable() {
		return primaryAvailable;
	}
	public void setPrimaryAvailable(boolean primaryAvailable) {
		this.primaryAvailable = primaryAvailable;
	}
	public boolean isSecondaryAvailable() {
		return secondaryAvailable;
	}
	public void setSecondaryAvailable(boolean secondaryAvailable) {
		this.secondaryAvailable = secondaryAvailable;
	}
	public boolean isHigherSecondaryAvailable() {
		return higherSecondaryAvailable;
	}
	public void setHigherSecondaryAvailable(boolean higherSecondaryAvailable) {
		this.higherSecondaryAvailable = higherSecondaryAvailable;
	}
	public boolean isGovernmentAided() {
		return governmentAided;
	}
	public void setGovernmentAided(boolean governmentAided) {
		this.governmentAided = governmentAided;
	}
	public boolean isInternational() {
		return international;
	}
	public void setInternational(boolean international) {
		this.international = international;
	}
	public boolean isSmartSchool() {
		return smartSchool;
	}
	public void setSmartSchool(boolean smartSchool) {
		this.smartSchool = smartSchool;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	
}
