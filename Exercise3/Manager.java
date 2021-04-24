package Exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;


interface Sortable {
	public abstract int compare(Sortable b);
	
	/* modified code by me from geeksforgeeks.org */
	public static void shell_sort(Sortable[] a) {
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

//Multiple Inheritance
public class Manager extends Employee implements Sortable{
	private String secretaryName;
	
	public Manager(String name, double salary, int hireday, int hiremonth, int hireyear) {
		super(name, salary, hireday, hiremonth, hireyear);
		secretaryName = "";
	}
	
	public void raiseSalary(double byPercent) {
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	public String getSecretaryName() {
		return secretaryName;
	}
}

