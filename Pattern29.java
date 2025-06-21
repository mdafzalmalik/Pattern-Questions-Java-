package patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n-1;
		int count = 1;
		int print_num = 1;
		while(row <= n) {
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing numbers pattern
			int i = 1;
			while(i <= count) {
				if(i == 1 || i == count) {
					System.out.print(print_num + " ");
				} else {
					System.out.print(0 + " ");
				}
				i++;
			}
			// next row
			System.out.println();
			count += 2;
			no_of_spaces--;
			row++;
			print_num++;
			
		}

	}

}
