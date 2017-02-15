public class Smartphones
{
private String model;
private String manufacturer;
private int diagonal;
private int ram;
private int battery;
private int resolutionMainCamera;
private String operatingSystem;
private int numberOfCores;
private String colour;
private int resolutionFrontCamera;

public static void main(String args[]){}

Smartphones(){
	model="";
	manufacturer="";
	diagonal=0;
	ram=0;
	battery=0;
	resolutionMainCamera=0;
	operatingSystem="";
	numberOfCores=0;
	colour="";
	resolutionFrontCamera=0;
}

Smartphones(String model, String manufacturer, int diagonal, int ram, int battery, int resolutionMainCamera, String operatingSystem, int numberOfCores, String colour, int resolutionFrontCamera)
{
	this.model=model;
	this.manufacturer=manufacturer;
	this.diagonal=diagonal;
	this.ram=ram;
	this.battery=battery;
	this.resolutionMainCamera=resolutionMainCamera;
	this.operatingSystem=operatingSystem;
	this.numberOfCores=numberOfCores;
	this.colour=colour;
	this.resolutionFrontCamera=resolutionFrontCamera;
}

public void createObjects() {
	Smartphones s1 = new Smartphones("Nokia 3310", "Nokia", 1, 2, 3, 4, "OS", 1, "B", 2);
	Smartphones s2 = new Smartphones("HTC 5632", "HTC", 2, 4, 2, 3, "Android", 1, "G", 5);
	} 

public void clearAllFields()
{
	model=null;
	manufacturer=null;
	diagonal=0;
	ram=0;
	battery=0;
	resolutionMainCamera=0;
	operatingSystem=null;
	numberOfCores=0;
	colour=null;
	resolutionFrontCamera=0;
}

public void setModel(String newModel) {
	model=newModel;
}
public String getModel() {
	return model;
}
public void setManufacturer(String newManufacturer) {
	manufacturer=newManufacturer;
}
public String getManufacturer() {
	return manufacturer;
}
public void setDiagonal(int newDiagonal) {
	diagonal=newDiagonal;
}
public int getDiagonal() {
	return diagonal;
}
public void setRam(int newRam) {
	ram=newRam;
}
public int getRam() {
	return ram;
}
public void setBattery(int newBattery) {
	battery=newBattery;
}
public int getBattery() {
	return battery;
}
public void setResolutionMainCamera(int newResolutionMainCamera) {
	resolutionMainCamera=newResolutionMainCamera;
}
public int getResolutionMainCamera() {
	return resolutionMainCamera;
}
public void setOperatingSystem(String newOperatingSystem) {
	operatingSystem=newOperatingSystem;
}
public String getOperatingSystem() {
	return operatingSystem;
}
public void setNumberOfCores(int newNumberOfCores) {
	numberOfCores=newNumberOfCores;
}
public int getNumberOfCores() {
	return numberOfCores;
}
public void setColour(String newColour) {
	colour=newColour;
}
public String getColour() {
	return colour;
}
public void setResolutionFrontCamera(int newResolutionFrontCamera) {
	resolutionFrontCamera=newResolutionFrontCamera;
}
public int getResolutionFrontCamera() {
	return resolutionFrontCamera;
}
}