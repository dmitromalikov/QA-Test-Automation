public class MusicalInstruments
{
private String name;
private String group;
private String frequencyRange;
private String dynamicRange;
private String directionOfSound;
private String country;
private String manufacturer;
private String model;
private int dateOfManufacture;
private int guaranteePeriod;

public static void main(String args[]){}

MusicalInstruments(){
	name="";
	group="";
	frequencyRange="";
	dynamicRange="";
	directionOfSound="";
	country="";
	manufacturer="";
	model="";
	dateOfManufacture=0;
	guaranteePeriod=0;
}

MusicalInstruments(String name, String group, String frequencyRange, String dynamicRange, String directionOfSound, String country, String manufacturer, String model, int dateOfManufacture, int guaranteePeriod)
{
	this.name=name;
	this.group=group;
	this.frequencyRange=frequencyRange;
	this.dynamicRange=dynamicRange;
	this.directionOfSound=directionOfSound;
	this.country=country;
	this.manufacturer=manufacturer;
	this.model=model;
	this.dateOfManufacture=dateOfManufacture;
	this.guaranteePeriod=guaranteePeriod;
}

public void createObjects() {
	MusicalInstruments m1 = new MusicalInstruments("flute", "D", "D", "E", "F", "Italy", "Yugt", "C879", 110578, 60);
	MusicalInstruments m2 = new MusicalInstruments("drum", "A", "K", "Y", "J", "USA", "Fjhg", "A321", 100793, 90);
	} 


public void clearAllFields()
{
	name=null;
	group=null;
	frequencyRange=null;
	dynamicRange=null;
	directionOfSound=null;
	country=null;
	manufacturer=null;
	model=null;
	dateOfManufacture=0;
	guaranteePeriod=0;
}
public void setName(String newName) {
	name=newName;
}
public String getName() {
	return name;
}
public void setGroup(String newGroup) {
	group=newGroup;
}
public String getGroup() {
	return group;
}
public void setFrequencyRange(String newFrequencyRange) {
	frequencyRange=newFrequencyRange;
}
public String getFrequencyRange() {
	return frequencyRange;
}
public void setDynamicRange(String newDynamicRange) {
	dynamicRange=newDynamicRange;
}
public String getDynamicRange() {
	return dynamicRange;
}
public void setDirectionOfSound(String newDirectionOfSound) {
	directionOfSound=newDirectionOfSound;
}
public String getDirectionOfSound() {
	return directionOfSound;
}
public void setCountry(String newCountry) {
	country=newCountry;
}
public String getCountry() {
	return country;
}
public void setManufacturer(String newManufacturer) {
	manufacturer=newManufacturer;
}
public String getManufacturer() {
	return manufacturer;
}
public void setModel(String newModel) {
	model=newModel;
}
public String getModel() {
	return model;
}
public void setDateOfManufacture(int newDateOfManufacture) {
	dateOfManufacture=newDateOfManufacture;
}
public int getDateOfManufacture() {
	return dateOfManufacture;
}
public void setGuaranteePeriod(int newGuaranteePeriod) {
	guaranteePeriod=newGuaranteePeriod;
}
public int getGuaranteePeriod() {
	return guaranteePeriod;
}
}