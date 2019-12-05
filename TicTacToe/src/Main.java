import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		new Main(true);
	}
	
	public Main(boolean x) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Geef een cijfer op:");
			System.out.println(scan.nextInt());
		}
		
	}
}
