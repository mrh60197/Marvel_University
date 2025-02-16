/**
  * Leonard Phillips
  * 15232331
  * Assignment 1 Part 2
  * This is a Marvel University. It uses classes and inheritance to simulate a University
  * with multiple staff roles.
  * It has been created using the Java programming langauge.
  */
public class Main {
	public static void main(String args[]) {
		final int SIZE = 10;
		info();
		Employee[] emps = new Employee[SIZE];
		emps[0] = new TEmp();
		emps[1] = new TEmp("Wuz", "Chris", "22-267-8012", "12323405", 6, 25);
		emps[2] = new TEmp("Jackson", "Priscilla", "63-232-1456", "08001896", 12, 23.50);
		emps[3] = new Admin();
		emps[4] = new Admin("Bush", "GeorgeJr", "06-1342-0456", 59099.76, "Librarian");
		emps[5] = new Admin("Clever", "Bob", "22-267-812", 79345.00, "Bussines Manger");
		emps[6] = new Prof();
		emps[7] = new Prof("Steiger", "Ludwig", "65-102-456", 79345.00, 3);
		emps[8] = new Prof("Flop", "Boby", "11-178-120", 69009.00, 0);
		emps[9] = new Prof("Maliyah", "Howell", "78-429-392", 75099.00, 2);		
		double totalToPay = 0.0;		
		for(int i = 0; i < SIZE; ++i) {
			totalToPay += emps[i].getNetMonthlyPay();
			System.out.println(emps[i]);
		}
		System.out.println("\nTotal wages this month: $" + totalToPay);
		//System.out.println("\nTotal wages this month: $" + totalToPay);
		System.out.println("Thank you for using our program! Bye!");
	}
	
	public static void info() {
		System.out.println("159.234 Assignment 2P1");
		System.out.println("Leonard Phillips   15232331\n");
	}
}