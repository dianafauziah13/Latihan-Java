package BelajarInheritance;

public class Itachi extends Rikudo {

	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
	System.out.println(this.KekkeiGenkai);
	}
	
	void printDojutsu() {
	System.out.println(this.Dojutsu);
	
	//Di tambahkan setDOjutsu() untuk menampilkan perubahan pada dojutsu
	setDojutsu(); //line yang di tambahkan
	System.out.println(this.Dojutsu);
	}
	
	private void setDojutsu() {
	this.Dojutsu = "Mangekyou Sharingan";
	}
                                                   
}
