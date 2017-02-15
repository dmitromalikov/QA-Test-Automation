public class ConsumerGoods 
{
private String name;
private String category;
private String subcategory;
private String manufacturer;
private int weight;
private int amount;
private int dimensions;
private String packaging;
private String properties;
private int storageLife;
private int dateOfManufacture;
private int storageConditions;
private int price;
private int markup;

public static void main(String args[]){}

ConsumerGoods(){
	name="";
	category="";
	subcategory="";
	manufacturer="";
	weight=0;
	amount=0;
	dimensions=0;
	packaging="";
	properties="";
	storageLife=0;
	dateOfManufacture=0;
	storageConditions=0;
	price=0;
	markup=0;
}

ConsumerGoods(String name, String category, String subcategory,
		String manufacturer, int weight, int amount, int dimensions,
		String packaging, String properties, int storageLife,
		int dateOfManufacture, int storageConditions,
		int price, int markup){
	this.name=name;
	this.category=category;
	this.subcategory=subcategory;
	this.manufacturer=manufacturer;
	this.weight=weight;
	this.amount=amount;
	this.dimensions=dimensions;
	this.packaging=packaging;
	this.properties=properties;
	this.storageLife=storageLife;
	this.dateOfManufacture=dateOfManufacture;
	this.storageConditions=storageConditions;
	this.price=price;
	this.markup=markup;
}

public void createObjects() {
	ConsumerGoods goods1 = new ConsumerGoods("Bread", "Food", "Bakery products", "Kyivhlib", 10, 20, 10, "package", "white", 2, 11, 12, 25, 2);
	ConsumerGoods goods2 = new ConsumerGoods("Loaf", "Food", "Bakery products", "Kyivhlib", 15, 30, 20, "package", "white", 1, 10, 12, 15, 1);
	} 

public void clearAllFields()
{
	name=null;
	category=null;
	subcategory=null;
	manufacturer=null;
	weight=0;
	amount=0;
	dimensions=0;
	packaging=null;
	properties=null;
	storageLife=0;
	dateOfManufacture=0;
	storageConditions=0;
	price=0;
	markup=0;
	
}
public void setName(String newName) {
	name=newName;
}
public String getName() {
	return name;
}
public void setCategory(String newCategory) {
	category=newCategory;
}
public String getCategory() {
	return category;
}
public void setSubCategory(String newSubCategory) {
	subcategory=newSubCategory;
}
public String getSubCategory() {
	return subcategory;
}
public void setManufacturer(String newManufacturer) {
	manufacturer=newManufacturer;
}
public String getManufacturer() {
	return manufacturer;
}
public void setWeight(int newWeight) {
	weight=newWeight;
}
public int getWeight() {
	return weight;
}
public void setAmount(int newAmount) {
	amount=newAmount;
}
public int getAmount() {
	return amount;
}
public void setDimensions(int newDimensions) {
	dimensions=newDimensions;
}
public int getDimensions() {
	return dimensions;
}
public void setPackaging(String newPackaging) {
	packaging=newPackaging;
}
public String getPackaging() {
	return packaging;
}
public void setProperties(String newProperties) {
	properties=newProperties;
}
public String getProperties() {
	return properties;
}
public void setStorageLife(int newStorageLife) {
	storageLife=newStorageLife;
}
public int getStorageLife() {
	return storageLife;
}
public void setDateOfManufacture(int newDateOfManufacture) {
	dateOfManufacture=newDateOfManufacture;
}
public int getDateOfManufacture() {
	return dateOfManufacture;
}
public void setStorageConditions(int newStorageConditions) {
	storageConditions=newStorageConditions;
}
public int getStorageConditions() {
	return storageConditions;
}
public void setPrice(int newPrice) {
	price=newPrice;
}
public int getPrice() {
	return price;
}
public void setMarkup(int newMarkup) {
	markup=newMarkup;
}
public int getMarkup() {
	return markup;
}
}