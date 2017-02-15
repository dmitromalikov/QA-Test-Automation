public class Employee
{
private String name;
private String surname;
private String middleName;
private int dateOfBirth;
private String gender;
private int startingDate;
private String familyStatus;
private String education;
private String specialty;
private String position;
private String department;
private String address;

public static void main(String args[]){}

Employee(){
	name="";
	surname="";
	middleName="";
	middleName="";
	dateOfBirth=0;
	gender="";
	startingDate=0;
	familyStatus="";
	education="";
	specialty="";
	position="";
	department="";
	address="";
}

Employee(String name, String surname, String middleName, int dateOfBirth, String gender, int startingDate, String familyStatus, String education, String specialty, String position, String department, String address)
{
	this.name=name;
	this.surname=surname;
	this.middleName=middleName;
	this.dateOfBirth=dateOfBirth;
	this.gender=gender;
	this.startingDate=startingDate;
	this.familyStatus=familyStatus;
	this.education=education;
	this.specialty=specialty;
	this.position=position;
	this.department=department;
	this.address=address;
}

public void createObjects() {
	Employee e1 = new Employee("Petro", "Sidorov", "Alexandrovich", 011056, "male", 01012016, "single", "high", "engineer", "engineer", "E", "Kharkov");
	Employee e2 = new Employee("Ivan", "Ivanov", "Petrovich", 011167, "male", 01010014, "single", "high", "engineer", "engineer", "D", "Kyiv");
	} 


public void clearAllFields()
{
	name=null;
	surname=null;
	middleName=null;
	dateOfBirth=0;
	gender=null;
	startingDate=0;
	familyStatus=null;
	education=null;
	specialty=null;
	position=null;
	department=null;
	address=null;
}
public void setName(String newName) {
	name=newName;
}
public String getName() {
	return name;
}
public void setSurname(String newSurname) {
	surname=newSurname;
}
public String getSurname() {
	return surname;
}
public void setMiddleName(String newMiddleName) {
	middleName=newMiddleName;
}
public String getMiddleName() {
	return middleName;
}
public void setDateOfBirth(int newDateOfBirth) {
	dateOfBirth=newDateOfBirth;
}
public int getDateOfBirth() {
	return dateOfBirth;
}
public void setGender(String newGender) {
	gender=newGender;
}
public String getGender() {
	return gender;
}
public void setStartingDate(int newStartingDate) {
	startingDate=newStartingDate;
}
public int getStartingDate() {
	return startingDate;
}
public void setFamilyStatus(String newFamilyStatus) {
	familyStatus=newFamilyStatus;
}
public String getFamilyStatus() {
	return familyStatus;
}
public void setEducation(String newEducation) {
	education=newEducation;
}
public String getEducation() {
	return education;
}
public void setSpecialty(String newSpecialty) {
	specialty=newSpecialty;
}
public String getSpecialty() {
	return specialty;
}
public void setPosition(String newPosition) {
	position=newPosition;
}
public String getPosition() {
	return position;
}
public void setDepartment(String newDepartment) {
	department=newDepartment;
}
public String getDepartment() {
	return department;
}
public void setAddress(String newAddress) {
	address=newAddress;
}
public String getAddress() {
	return address;
}
}
