package patterns;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int count = n;
		while(row <= n) {
			// printing number pattern with star
			int i = 1;
			int print_num = n;
			while(i <= count) {
				if(i == n-row+1) {
					System.out.print("* ");
				} else {
					System.out.print(print_num + " ");
				}
				i++;
				print_num--;
			}
			// next row
			System.out.println();
			row++;
		}

	}

}
