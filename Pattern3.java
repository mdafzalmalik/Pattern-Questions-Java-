package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int no_of_stars = n;
		while(row <= n) {
			// printing stars;
			int star = 1;
			while(star <= no_of_stars) {
				System.out.print("* ");
				star++;
			}
			// next row
			System.out.println();
			row++;
			no_of_stars--;
		}

	}

}
