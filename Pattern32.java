package patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int count  = 1;
		int no_of_spaces = 2*n-2;
		int print_num = 1;
		while(row <= 2*n-1) {
			// printing numbers pattern
			int i = 1;
			while(i <= count) {
				if(i%2 != 0) {
					System.out.print(print_num + " ");
				} else {
					System.out.print("* ");
				}
				i++;
			}
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// next row
			System.out.println();
			// mirroring
			if(row < (2*n)/2) {
				count += 2;
				no_of_spaces -= 2;
				print_num++;
			} else {
				count -= 2;
				no_of_spaces += 2;
				print_num--;
			}
			row++;
		}

	}

}
