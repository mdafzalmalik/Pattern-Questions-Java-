package patterns;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_stars = 1;
		int no_of_spaces = n-1;
		while(row <= 2*n-1) {
			//printing spaces
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
			// mirroring
			if(row < n) {
				no_of_stars++;
				no_of_spaces--;
			} else {
				no_of_stars--;
				no_of_spaces++;
			}
			row++;
		}

	}

}
