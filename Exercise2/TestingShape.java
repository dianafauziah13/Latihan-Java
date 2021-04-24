package Exercise2;

public class TestingShape {

	public static void main(String[] args) {
		Shape Di = new Shape(); //No argumen
		Shape ana = new Shape("blue", false);
		
		System.out.println(Di.toString());
		System.out.println(ana.toString());
		
		Di.setColor("red");
		Di.setFilled(false);	
		System.out.println("Objek Di setelah di ubah");
		System.out.println(Di.toString());
	}

}
