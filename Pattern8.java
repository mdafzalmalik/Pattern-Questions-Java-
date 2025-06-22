package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// applicable for odd no.
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = 0;
		int no_of_stars = n;
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
				if(star == 1 || star == no_of_stars) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				star++;
			}
			// next row
			System.out.println();
			// mirroring
			if(row < n/2+1) {
				no_of_spaces++;
				no_of_stars -= 2;
			} else {
				no_of_spaces--;
				no_of_stars += 2;
			}
			row++;
		}

	}

}
