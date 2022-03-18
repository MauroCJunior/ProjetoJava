import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		
		System.out.print(product1);
		System.out.print(", which price is $ ");
		System.out.printf("%.2f%n", price1);
		
		System.out.print(product2);
		System.out.print(", which price is $ ");
		System.out.printf("%.2f%n", price2);
		
		System.out.println(" ");
		
		System.out.print("Record: ");
		System.out.print(age);
		System.out.print(" years old, code ");
		System.out.print(code);
		System.out.print(" and gender: ");
		System.out.println(gender);
		
		System.out.println(" ");
		
		System.out.print("Measue with eigt decimal places: ");
		System.out.printf("%.8f%n", measure);
		
		System.out.print("Rouded (tree decimal places): ");
		System.out.printf("%.3f%n", measure);	
		
		System.out.print("US decimal point: ");
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", measure);		
		
	}

}
