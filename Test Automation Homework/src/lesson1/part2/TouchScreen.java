public class TouchScreen
{
private String handInGlove; // Reaction with the gloved hand
private String conductiveObjects; // Pressing a conductive object
private String notConductiveObject; // Pressing the subject of non-conductive
private int strength; // The ability to measure the pressing force
private String transparency; // Limiting transparency %
private int accuracy; // Accuracy of work
private String resource; // Resource million. Taps
private String protection; // Protection against dirt and liquids
private String resistance; // Resistance to shock
private String multitouch; // multiple press

//Press one finger
public void press1(){
	System.out.print("Press one finger");
}
//Press with two fingers
public void press2(){
	System.out.print("Press with two fingers");
}
//Press three fingers
public void press3(){
	System.out.print("Press three fingers");
}
//Press four fingers
public void press4(){
	System.out.print("Press four fingers");
}
//Move up with your fingers
public void moveUp(){
	System.out.print("Move up with your fingers");
}
//Move your fingers down
public void moveDown(){
	System.out.print("Move your fingers down");
}
//Pour water
public void pourWater(){
	System.out.print("Pour water");
}
//Sprinkle with mud
public void sprinkle(){
	System.out.print("Sprinkle with mud");
}
//Punch on the screen
public void bump(){
	System.out.print("Punch on the screen");
}
//To drop to the floor
public void drop(){
	System.out.print("To drop to the floor");
}
}
