package patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = 1;
		int no_of_stars = n/2;
		while(row <= n) {
			//printing 1st star pattern
			int star = 1;
			while(star <= no_of_stars) {
				System.out.print("* ");
				star++;
			}
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing 2nd star pattern
			int star_ = 1;
			while(star_ <= no_of_stars) {
				System.out.print("* ");
				star_++;
			}
			// next row
			System.out.println();
			// mirroring
			if(row < n/2+1) {
				no_of_spaces += 2;
				no_of_stars--;
			} else {
				no_of_spaces -= 2;
				no_of_stars++;
			}
			row++;
		}

	}

}
