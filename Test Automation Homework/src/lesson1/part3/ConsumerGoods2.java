public class ConsumerGoods2 extends ConsumerGoods
{
private int priceUah;
private int priceUsd;
private boolean credit;

public static void main(String args[]){}

public void setPriceUah(int newPriceUah) {
	priceUah=newPriceUah;
}
public int getPriceUah() {
	return priceUah;
}
public void setPriceUsd(int newPriceUsd) {
	priceUsd=newPriceUsd;
}
public int getPriceUsd() {
	return priceUsd;
}
public void setCredit(boolean newCredit) {
	credit=newCredit;
}
public boolean getCredit() {
	return credit;
}
}