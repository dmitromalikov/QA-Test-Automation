public class Tvs
{
private String model;
private String manufacturer;
private int diagonal;
private String supportsSmartTv;
private int screenResolution;
private String haveWiFi;
private String screenType;
private String manufacturerCountry;
private String typeTvTuner;
private String colour;

public static void main(String args[]){}

Tvs(){
	model="";
	manufacturer="";
	diagonal=0;
	supportsSmartTv="";
	screenResolution=0;
	haveWiFi="";
	screenType="";
	manufacturerCountry="";
	typeTvTuner="";
	colour="";
}

Tvs(String model, String manufacturer, int diagonal, String supportsSmartTv, int screenResolution, String haveWiFi, String screenType, String manufacturerCountry, String typeTvTuner, String colour)
{
	this.model=model;
	this.manufacturer=manufacturer;
	this.diagonal=diagonal;
	this.supportsSmartTv=supportsSmartTv;
	this.screenResolution=screenResolution;
	this.haveWiFi=haveWiFi;
	this.screenType=screenType;
	this.manufacturerCountry=manufacturerCountry;
	this.typeTvTuner=typeTvTuner;
	this.colour=colour;
}

public void createObjects() {
	Tvs t1 = new Tvs("B8797", "LG", 56, "Yes", 1920, "Yes", "O", "B", "C", "Grey");
	Tvs t2 = new Tvs("N6764", "Samsung", 65, "No", 2040, "Yes", "D", "G", "A", "Black");
	} 


public void clearAllFields()
{
	model=null;
	manufacturer=null;
	diagonal=0;
	supportsSmartTv=null;
	screenResolution=0;
	haveWiFi=null;
	screenType=null;
	manufacturerCountry=null;
	typeTvTuner=null;
	colour=null;
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
public void setSupportsSmartTv(String newSupportsSmartTv) {
	supportsSmartTv=newSupportsSmartTv;
}
public String getSupportsSmartTv() {
	return supportsSmartTv;
}
public void setScreenResolution(int newScreenResolution) {
	screenResolution=newScreenResolution;
}
public int getScreenResolution() {
	return screenResolution;
}
public void setHaveWiFi(String newHaveWiFi) {
	haveWiFi=newHaveWiFi;
}
public String getHaveWiFi() {
	return haveWiFi;
}
public void setScreenType(String newScreenType) {
	screenType=newScreenType;
}
public String getScreenType() {
	return screenType;
}
public void setManufacturerCountry(String newManufacturerCountry) {
	manufacturerCountry=newManufacturerCountry;
}
public String getManufacturerCountry() {
	return manufacturerCountry;
}
public void setTypeTvTuner(String newTypeTvTuner) {
	typeTvTuner=newTypeTvTuner;
}
public String getTypeTvTuner() {
	return typeTvTuner;
}
public void setColour(String newColour) {
	colour=newColour;
}
public String getColour() {
	return colour;
}
}