public class ConsumerGoods 
{
private String name; // Name of product
private String category; // Product Category
private String subcategory; // Product Subcategory
private String manufacturer; // Manufacturer products
private int weight; // Product Weight
private int amount; // Production Amount
private int dimensions; // Product Dimensions
private String packaging; // Type of product packaging
private String properties; // Product Features
private int storageLife; // Product storage life
private int dateOfManufacture; // Product manufacturing date
private int storageConditions; // Product Storage
private int price; // Price products
private int markup; // Markup for products, %

// Put the goods to the parish from the supplier
public void coming(){
	System.out.print("Coming goods");
}
//Consumption of goods for sale through convenience store
public void consumption(){
	System.out.print("Consumption of goods");
}
//Charge off goods
public void chargeOff(){
	System.out.print("Charge off goods");
}
//Discount goods
public void discount(){
	System.out.print("Discount goods");
}
//Markup goods
public void markup(){
	System.out.print("Markup goods");
}
//Move goods to other locations
public void move(){
	System.out.print("Move goods to other locations");
}
//Make return to the supplier
public void toreturn(){
	System.out.print("Make return to the supplier");
}//Put goods for safekeeping
public void toSafekeeping(){
	System.out.print("Put goods to responsible storage");
}//Remove goods from of responsible storage
public void fromSafekeeping(){
	System.out.print("Remove goods from responsible storage");
}//Pay for goods
public void pay(){
	System.out.print("Pay for goods");
}
}



