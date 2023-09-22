import java.util.Arrays;
import java.util.Scanner;

public class Laivanupotus {
	public static void printArray(String array[][]) {
		System.out.println(" 12345");
		for(int i = 0; i < array.length; i++) {
			System.out.print(i+1);
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		String[][] array = new String[5][5];
		Scanner scanner = new Scanner(System.in);
		int rivi = 0;
		int sarake = 0;
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = "O";
			}
		}
		while(true) {
			printArray(array);
			System.out.println("Anna rivi (paina 0 lopettaaksesi)");
			rivi = Integer.parseInt(scanner.nextLine());
			if(rivi == 0) {
				break;
			}
			System.out.println("Anna sarake");
			sarake = Integer.parseInt(scanner.nextLine());
			array[rivi-1][sarake-1] = "X";
		}
		
		
		
	}

}
