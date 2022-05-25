package SoftwareTestingPractical;

import java.util.Scanner;

public class FIndTriangleType {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three sides of Trianble");
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();
		System.out.println("C:");
		c = sc.nextInt();
		if ((a > 10) || (b > 10) || (c > 10)) {
			System.out.println("Out of range");
		} else if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
			if ((a == b) && (b == c)) {
				System.out.println("Equilateral Triangle");
			}
			else if((a!=b)&&(b!=c)&&(a!=c)) {
				System.out.println("Scalene Triangle");
			}
			else {
				System.out.println("Isosceles Triangle");
			}
		}
		else {
			System.out.println("Triangle not Found");
		}
	}

}
