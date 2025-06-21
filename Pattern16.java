package patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n-1;
		int no_of_stars = n;
		while(row <= 2*n-1) {
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
			if(row < n) {
				no_of_spaces--;
				no_of_stars--;
			} else {
				no_of_spaces++;
				no_of_stars++;
			}
			row++;
		}

	}

}
