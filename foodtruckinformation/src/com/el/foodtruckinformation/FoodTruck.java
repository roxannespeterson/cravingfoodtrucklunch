package com.el.foodtruckinformation;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class FoodTruck {

	private int locID;
	private String applicant;
	private String facilityType;
	private int cnn;
	private String locDesc;
	private String address;
	private String blocklot;
	private String block;
	private String lot;
	private String permit;
	private String status;
	private String foodItems;
	private float X;
	private float Y;
	private float longitude;
	private float latitude;
	private URL schedule;
	private String dayshours;
	private String NOISent;
	private LocalDateTime approved;
	private int received;
	private int priorPermit;
	private LocalDateTime expirationDate;
	private String location;
	private int firePreventionDistrict;
	private int policeDistrict;
	private int supervisorDistrict;
	private String zipcode;
	private int neighborhood;
	
	DateTimeFormatter formatter = new DateTimeFormatterBuilder()
    		.appendPattern("MM/dd/yyyy hh:mm:ss a")
    		.toFormatter();
	//TODO cleanup set methods to be more concise
	public int getLocID() {
		return locID;
	}
	public void setLocID(int locID) {
		this.locID = locID;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public int getCnn() {
		return cnn;
	}
	public void setCnn(int cnn) {
		this.cnn = cnn;
	}
	public void setCnn(String cnn) {
		if ( cnn.isBlank())
		{
			this.cnn = Integer.parseInt("");
		}
		else {
			this.cnn = Integer.parseInt(cnn);
		}
	}
	public String getLocDesc() {
		return locDesc;
	}
	public void setLocDesc(String locDesc) {
		this.locDesc = locDesc;
	}
	public String getBlocklot() {
		return blocklot;
	}
	public void setBlocklot(String blocklot) {
		this.blocklot = blocklot;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}
	public float getX() {
		return X;
	}
	public void setX(float x) {
		X = x;
	}
	public void setX(String x) {
		if ( x.isBlank())
		{
			this.X = Float.parseFloat("1.0f");
		}
		else {
			this.X = Float.parseFloat(x);
		}
	}
	public float getY() {
		return Y;
	}
	public void setY(float y) {
		Y = y;
	}
	public void setY(String y) {
		if ( y.isBlank())
		{
			this.Y = Float.parseFloat("1.0f");
		}
		else {
			this.Y = Float.parseFloat(y);
		}
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public void setLongitude(String longitude) {
		if ( longitude.isBlank())
		{
			this.longitude = Float.parseFloat("1.0f");
		}
		else {
			this.longitude = Float.parseFloat(longitude);
		}
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public void setLatitude(String latitude) {
		if (latitude.isBlank())
		{
			this.latitude = Float.parseFloat("1.0f");
		}
		else {
			this.latitude = Float.parseFloat(latitude);
		}
	}
	public URL getSchedule() {
		return schedule;
	}
	public void setSchedule(URL schedule) {
		this.schedule = schedule;
	}
	public String getDayshours() {
		return dayshours;
	}
	public void setDayshours(String dayshours) {
		this.dayshours = dayshours;
	}
	public String getNOISent() {
		return NOISent;
	}
	public void setNOISent(String nOISent) {
		NOISent = nOISent;
	}
	public LocalDateTime getApproved() {
		return approved;
	}
	public void setApproved(LocalDateTime approved) {
		this.approved = approved;
	}
	public void setApproved(String approved) {
		if (approved.isBlank())
		{
			this.approved = null;
		}
		else {
			this.approved = LocalDateTime.parse(approved, formatter);
		}
	}
	public int getRecieved() {
		return received;
	}
	public void setRecieved(int received) {
		this.received = received;
	}
	public void setReceived(String received) {
		if (received.isBlank())
		{
			this.received = Integer.parseInt("0");
		}
		else
		{
			this.received = Integer.parseInt(received);
		}
	}
	public int getPriorPermit() {
		return priorPermit;
	}
	public void setPriorPermit(int priorPermit) {
		this.priorPermit = priorPermit;
	}
	public void setPriorPermit(String priorPermit) {
		if (priorPermit.isBlank())
		{
			this.priorPermit = Integer.parseInt("0");
		}
		else
		{
			this.priorPermit = Integer.parseInt(priorPermit);
		}
	}
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}
	public void setExperationDate(String expirationDate) {
		if (expirationDate.isBlank())
		{
			this.expirationDate = null;
		}
		else {
			this.expirationDate = LocalDateTime.parse(expirationDate, formatter);
		}
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getFirePreventionDistrict() {
		return firePreventionDistrict;
	}
	public void setFirePreventionDistrict(int firePreventionDistrict) {
		this.firePreventionDistrict = firePreventionDistrict;
	}
	public void setFirePreventionDistrict(String firePreventionDistrict) {
		if (firePreventionDistrict.isBlank())
		{
			this.firePreventionDistrict = Integer.parseInt("0");
		}
		else
		{
			this.firePreventionDistrict = Integer.parseInt(firePreventionDistrict);
		}
	}
	public int getPoliceDistrict() {
		return policeDistrict;
	}
	public void setPoliceDistrict(int policeDistrict) {
		this.policeDistrict = policeDistrict;
	}
	public void setPoliceDistrict(String policeDistrict) {
		if (policeDistrict.isBlank())
		{
			this.policeDistrict = Integer.parseInt("0");
		}
		else 
		{
			this.policeDistrict = Integer.parseInt(policeDistrict);
		}
	}
	public int getSupervisorDistrict() {
		return supervisorDistrict;
	}
	public void setSupervisorDistrict(int supervisorDistrict) {
		this.supervisorDistrict = supervisorDistrict;
	}
	public void setSupervisorDistrict(String supervisorDistrict) {
		if (supervisorDistrict.isBlank())
		{
			this.supervisorDistrict = Integer.parseInt("0");
		}
		else
		{
			this.supervisorDistrict = Integer.parseInt(supervisorDistrict);
		}
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(int neighborhood) {
		this.neighborhood = neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		if (neighborhood.isBlank())
		{
			this.neighborhood = Integer.parseInt("0");
		}
		else
		{
			this.neighborhood = Integer.parseInt(neighborhood);
		}
	}
	
	public void printFoodTruck()
	{
		//TODO cleanup and format
		System.out.print(this.getLocID() + " ");
		System.out.print(this.getApplicant() + " ");
		System.out.print(this.getFacilityType() + " ");
		System.out.print(this.getCnn() + " ");
		System.out.print(this.getLocDesc() + " ");
		System.out.print(this.getAddress() + " ");
		System.out.print(this.getBlocklot() + " ");
		System.out.print(this.getBlock() + " ");
		System.out.print(this.getLot() + " ");
		System.out.print(this.getPermit() + " ");
		System.out.print(this.getStatus() + " ");
		System.out.print(this.getFoodItems() + " ");
		System.out.print(this.getX() + " ");
		System.out.print(this.getY() + " ");
		System.out.print(this.getLatitude() + " ");
		System.out.print(this.getLongitude() + " ");
		System.out.print(this.getSchedule() + " ");
		System.out.print(this.getDayshours() + " ");
		System.out.print(this.getNOISent() + " ");
		System.out.print(this.getApproved() + " ");
		System.out.print(this.getRecieved() + " ");
		System.out.print(this.getPriorPermit() + " ");
		System.out.print(this.getExpirationDate() + " ");
		System.out.print(this.getLocation() + " ");
		System.out.print(this.getFirePreventionDistrict() + " ");
		System.out.print(this.getPoliceDistrict() + " ");
		System.out.print(this.getSupervisorDistrict() + " ");
		System.out.print(this.getZipcode() + " ");
		System.out.println(this.getNeighborhood());
	}

	
	
	
}
