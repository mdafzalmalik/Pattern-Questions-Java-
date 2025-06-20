package patterns;

import java.util.Scanner;


public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n-1;
		int no_of_ones = 1;
		while(row <= n) {
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.err.print("  ");
				space++;
			}
			// printing 1's
			int i = 1;
			while(i <= no_of_ones) {
				System.out.print(1 + " ");
				i++;
			}
			// next row
			System.out.println();
			row++;
			no_of_ones += 2;
			no_of_spaces--;
		}

	}

}
