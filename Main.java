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
		
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		
		System.out.printf("%s, which price is $ %.2f%n \r\n", product2, price2);
		
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n \r\n", age, code, gender);
		
		
		System.out.printf("Measue with eigt decimal places: %.8f%n", measure);
		
		System.out.printf("Rouded (tree decimal places): %.3f%n", measure);	
		
		System.out.print("US decimal point: ");
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", measure);
		
	
		System.out.printf("Rouded (tree decimal places): %.3f%n", measure);		
		
	}

}
