package patterns;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int count = n;
		while(row <= n) {
			// printing number square
			int i = 1;
			int print_num = n;
			while(i <= count) {
				System.out.print(print_num + " ");
				i++;
				print_num--;
			}
			// next row
			System.out.println();
			row++;
		}

	}

}
