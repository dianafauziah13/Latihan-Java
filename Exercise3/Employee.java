package Exercise3;

abstract class Sortable {
	public abstract int compare(Sortable b);

	//diambil dari google
	public static void shell_sort(Sortable[] a){ 
		int increment = a.length / 2; 	
		while (increment > 0) { 		
			for (int i = increment; i < a.length; i++) { 			
				int j = i; 			
				Sortable temp = a[i]; 			
				while (j >= increment && a[j - increment] > temp) { 				
					a[j] = a[j - increment]; 				
					j = j - increment; 			
					} 			
				a[j] = temp; 		
				} 		
			if (increment == 2) { 			
				increment = 1; 		
				} else { 			
					increment *= (5.0 / 11); 		
					} 	
			}
	}
}

class Employee extends Sortable {
	public Employee(String n, double s, int day, int month, int year){ 
		 name = n;
		 salary = s;
		 hireday = day;
		 hiremonth = month;
		 hireyear = year;
	}
	public void print(){ 
		System.out.println(name + " " + salary + " " + hireYear());
	}
		
	public void raiseSalary(double byPercent){ 
		salary *= 1 + byPercent / 100;
	}
	public int hireYear(){ 
		return hireyear;
	}
	
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
	
	//implementasikan method abstrak
	public int compare(Sortable b) {
		Employee eb = (Employee) b;
		if (salary<eb.salary) return -1;
		if (salary>eb.salary) return +1;
		return 0;
	}

}

