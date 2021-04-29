package ContohPoly;

public class Commission extends Hourly {
	private double totalSales=0;
	private double commisi;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double com){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commisi = com;
	}
	
	public void addSales (double totalSales){
		this.totalSales += totalSales;
	}
	
	public double pay(){
		double payment= super.pay() + totalSales * commisi;
		totalSales=0;
		return payment;
	}
	
	public String toString(){
	String result = super.toString();
	result += "\nTotal Sales: " + totalSales;
	return result;
	}
	
	
}
