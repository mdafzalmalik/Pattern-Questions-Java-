package patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_stars = 1;
		while(row <= 2*n-1) {
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
			} else {
				no_of_stars--;
			}
			row++;
		}

	}

}
