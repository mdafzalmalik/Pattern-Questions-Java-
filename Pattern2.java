package patterns;

import java.util.Scanner; 

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int no_of_stars = 1;
		while(row <= n) {
			// printing stars
			int star = 1;
			while(star <= no_of_stars) {
				System.out.print("* ");
				star++;
			}
			// next row
			System.out.println();
			no_of_stars++;
			row++;
		}

	}

}
