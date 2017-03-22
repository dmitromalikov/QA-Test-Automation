public class IdCard
{
	private int dateExpire;
	private int number;
	public IdCard(int n){
		number=n;
	}
public void setNumber(int newNumber){
	number=newNumber;
	}
public int getNumber(){
	return number;
}
public void setDateExpire(int newDateExpire){
	dateExpire = newDateExpire;
	}
public int getDateExpire(){
	return dateExpire;
}

IdCard card = new IdCard(123);
public void output(){
	System.out.println(Employee.class.getName() +" work in position "+ Employee.getPosition());
	System.out.println("Certificate ¹ " + Employee.class.getIdCard() + " valid until " + getDateExpire());
	}
}