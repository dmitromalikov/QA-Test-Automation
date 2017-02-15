public class Entertainment
{
private String name;
private String countryOfOrigin;
private int yearOfOrigin;
private String type;
private int minimumOfParticipants;
private int maximumOfParticipants;
private String requiredClothing;
private String necessaryEquipment;
private int costOf;
private String necessaryDislocation;

public static void main(String args[]){}

Entertainment(){
	name="";
	countryOfOrigin="";
	yearOfOrigin=0;
	type="";
	minimumOfParticipants=0;
	maximumOfParticipants=0;
	requiredClothing="";
	necessaryEquipment="";
	costOf=0;
	necessaryDislocation="";
}

Entertainment(String name, String countryOfOrigin, int yearOfOrigin, String type, int minimumOfParticipants, int maximumOfParticipants, String requiredClothing, String necessaryEquipment, int costOf, String necessaryDislocation)
{
	this.name=name;
	this.countryOfOrigin=countryOfOrigin;
	this.yearOfOrigin=yearOfOrigin;
	this.type=type;
	this.minimumOfParticipants=minimumOfParticipants;
	this.maximumOfParticipants=maximumOfParticipants;
	this.requiredClothing=requiredClothing;
	this.necessaryEquipment=necessaryEquipment;
	this.costOf=costOf;
	this.necessaryDislocation=necessaryDislocation;
}

public void createObjects() {
	Entertainment e1 = new Entertainment("film", "USA", 20, "passive", 1, 1000, "A", "C", 10, "");
	Entertainment e2 = new Entertainment("dance", "EU", 01, "active", 1, 1000, "B", "D", 0, "");
	} 

public void clearAllFields()
{
	name=null;
	countryOfOrigin=null;
	yearOfOrigin=0;
	type=null;
	minimumOfParticipants=0;
	maximumOfParticipants=0;
	requiredClothing=null;
	necessaryEquipment=null;
	costOf=0;
	necessaryDislocation=null;
}
public void setName(String newName) {
	name=newName;
}
public String getName() {
	return name;
}
public void setCountryOfOrigin(String newCountryOfOrigin) {
	countryOfOrigin=newCountryOfOrigin;
}
public String getCountryOfOrigin() {
	return countryOfOrigin;
}
public void setYearOfOrigin(int newYearOfOrigin) {
	yearOfOrigin=newYearOfOrigin;
}
public int getYearOfOrigin() {
	return yearOfOrigin;
}
public void setType(String newType) {
	type=newType;
}
public String getType() {
	return type;
}
public void setMinimumOfParticipants(int newMinimumOfParticipants) {
	minimumOfParticipants=newMinimumOfParticipants;
}
public int getMinimumOfParticipants() {
	return minimumOfParticipants;
}
public void setMaximumOfParticipants(int newMaximumOfParticipants) {
	maximumOfParticipants=newMaximumOfParticipants;
}
public int getMaximumOfParticipants() {
	return maximumOfParticipants;
}
public void setRequiredClothing(String newRequiredClothing) {
	requiredClothing=newRequiredClothing;
}
public String getRequiredClothing() {
	return requiredClothing;
}
public void setNecessaryEquipment(String newNecessaryEquipment) {
	necessaryEquipment=newNecessaryEquipment;
}
public String getNecessaryEquipment() {
	return necessaryEquipment;
}
public void setCostOf(int newCostOf) {
	costOf=newCostOf;
}
public int getCostOf() {
	return costOf;
}
public void setNecessaryDislocation(String newNecessaryDislocation) {
	necessaryDislocation=newNecessaryDislocation;
}
public String getNecessaryDislocation() {
	return necessaryDislocation;
}
}