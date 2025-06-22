package patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n/2;
		int no_of_stars = 1;
		while(row <= n) {
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing stars and spaces
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
				no_of_spaces--;
				no_of_stars += 2;
			} else {
				no_of_spaces++;
				no_of_stars -= 2;
			}
			row++;
		}

	}

}
