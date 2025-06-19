package patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n-1;
		int no_of_stars_excla = 1;
		while(row <= n) {
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing stars and exclamatory signs
			int stars_excla = 1;
			while(stars_excla <= no_of_stars_excla) {
				if(stars_excla % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				stars_excla++;
			}
			// next row
			System.out.println();
			row++;
			no_of_spaces--;
			no_of_stars_excla += 2;
		}

	}

}
