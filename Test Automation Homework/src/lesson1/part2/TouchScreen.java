public class TouchScreen
{
private String handInGlove;
private String conductiveObject;
private String notConductiveObject;
private int strength;
private String transparency;
private int accuracy;
private String resource;
private String protection;
private String resistance;
private String multitouch;

public static void main(String args[]){}

TouchScreen(){
	handInGlove="";
	conductiveObject="";
	notConductiveObject="";
	strength=0;
	transparency="";
	accuracy=0;
	protection="";
	resistance="";
	multitouch="";
}

TouchScreen(String handInGlove, String conductiveObject, String notConductiveObject, int strength, String transparency, int accuracy, String protection, String resistance, String multitouch)
{
	this.handInGlove=handInGlove;
	this.conductiveObject=conductiveObject;
	this.notConductiveObject=notConductiveObject;
	this.strength=strength;
	this.transparency=transparency;
	this.accuracy=accuracy;
	this.protection=protection;
	this.resistance=resistance;
	this.multitouch=multitouch;
}

public void createObjects() {
	TouchScreen t1 = new TouchScreen("Yes", "KO", "BGHG", 2, "VVGF", 4, "OHBHGFGF", "B", "Yes");
	TouchScreen t2 = new TouchScreen("No", "HMF", "HFDD", 4, "FFHGF", 3, "HGDFTRDT", "G", "Yes");
	} 

public void clearAllFields()
{
	handInGlove=null;
	conductiveObject=null;
	notConductiveObject=null;
	strength=0;
	transparency=null;
	accuracy=0;
	resource=null;
	protection=null;
	resistance=null;
	multitouch=null;
}

public void setHandInGlove(String newHandInGlove) {
	handInGlove=newHandInGlove;
}
public String getHandInGlove() {
	return handInGlove;
}
public void setConductiveObject(String newConductiveObject) {
	conductiveObject=newConductiveObject;
}
public String getConductiveObject() {
	return conductiveObject;
}
public void setNotConductiveObject(String newNotConductiveObject) {
	notConductiveObject=newNotConductiveObject;
}
public String getNotConductiveObject() {
	return notConductiveObject;
}
public void setStrength(int newStrength) {
	strength=newStrength;
}
public int getStrength() {
	return strength;
}
public void setTransparency(String newTransparency) {
	transparency=newTransparency;
}
public String getTransparency() {
	return transparency;
}
public void setAccuracy(int newAccuracy) {
	accuracy=newAccuracy;
}
public int getAccuracy() {
	return accuracy;
}
public void setResource(String newResource) {
	resource=newResource;
}
public String getResource() {
	return resource;
}
public void setProtection(String newProtection) {
	protection=newProtection;
}
public String getProtection() {
	return protection;
}
public void setResistance(String newResistance) {
	resistance=newResistance;
}
public String getResistance() {
	return resistance;
}
public void setMultitouch(String newMultitouch) {
	multitouch=newMultitouch;
}
public String getMultitouch() {
	return multitouch;
}
}
