package SoftwareTestingPractical;

import java.util.Scanner;

public class NextDateFunction {

	public static void main(String[] args) {
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int d,m,y,nd,nm,ny,ndays=0,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date,month,year:");
		System.out.println("D:");
		d = sc.nextInt();
		System.out.println("M:");
		m = sc.nextInt();
		System.out.println("Y:");
		y = sc.nextInt();
		if(m>12) {
			ndays = month[m-2];
		}
		else {
			ndays = month[m-1];
		}
		if(y<=1890 || y>2021) {
			System.out.println("Invalid Year...");
			flag=1;
		}
		if(m<1 || m>12) {
			System.out.println("Invalid Month...");
			flag=1;
		}
		if(d<1 || d>ndays) {
			System.out.println("Invalid date...");
			flag=1;
		}
		if(m==2) {
			if(y%100==0) {
				if(y%400==0) {
					ndays=29;
				}
			}
			else if(y%4==0) {
				ndays=29;
			}
		}
		nd=d+1;
		nm=m;
		ny=y;
		if(nd>ndays) {
			nd=1;
			nm++;
		}
		if(nm>12) {
			nm=1;
			ny++;
		}
		System.out.println("The given date is :"+d+"/"+m+"/"+y);
		System.out.println("The next date is :"+nd+"/"+nm+"/"+ny);
	}

}
