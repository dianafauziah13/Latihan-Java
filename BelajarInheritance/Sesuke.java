package BelajarInheritance;

public class Sesuke extends Itachi {
	
	String Dojutsu = "Sharingan";

	void printDojutsu() {
	//ditambahkan untuk memanggil method yang dimiliki oleh superclassnya
	super.printDojutsu(); //line yang ditambahkan
	System.out.println(this.Dojutsu);
	}

}
