package patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n-1;
		int count = 1;
		while(row <= n) {
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing number pattern
			int i = 1;
			int print_num = 1;
			while(i <= count) {
				System.out.print(print_num + " ");
				if(i < count/2+1) {
					print_num++;
				} else {
					print_num--;
				}
				i++;
			}
			// next row
			System.out.println();
			row++;
			no_of_spaces--;
			count += 2;
		}

	}

}
