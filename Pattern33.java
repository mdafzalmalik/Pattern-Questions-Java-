package patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int no_of_spaces = n-1;
		int count = 1;
		int num = n;
		while(row <= n) {
			// printing spaces
			int space = 1;
			while(space <= no_of_spaces) {
				System.out.print("  ");
				space++;
			}
			// printing numbers pattern
			int i = 1;
			int print_num = num;
			while(i <= count) {
				if(i == row) {
					System.out.print(0 + " ");
				}
				// mirroring
				else {
					if(i < count/2+1) {
					System.out.print(print_num + " ");
					print_num++;
					} 	
					else {
					print_num--;
					System.out.print(print_num + " ");
					}
				}
				i++;
			}
			// next row
			System.out.println();
			row++;
			count += 2;
			no_of_spaces--;
			num--;
		}

	}

}
