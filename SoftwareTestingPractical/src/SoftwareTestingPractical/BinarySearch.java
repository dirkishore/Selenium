package SoftwareTestingPractical;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrVal[] = { 100, 200, 300, 400, 500 };
		System.out.println("The Array:" + Arrays.toString(arrVal));
		System.out.println("Enter key value:");
		int key = sc.nextInt();
		int first = 0;
		int last = arrVal.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arrVal[mid] < key) {
				first = mid + 1;
			} else if (arrVal[mid] == key) {
				System.out.println("Element is found at index:" + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element not found!");
		}
	}

}
