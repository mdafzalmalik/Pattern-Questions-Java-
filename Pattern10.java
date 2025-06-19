package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = 0;
		int no_of_stars = 2*n-1;
		while(row <= n) {
			// printing spaces 
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing stars 
			int star = 1;
			while(star <= no_of_stars) {
				System.out.print("* ");
				star++;
			}
			// next row
			System.out.println();
			row++;
			no_of_spaces++;
			no_of_stars -= 2;
		}

	}

}
