import java.util.Scanner;

public class CommissionProgram{

	public static void main(String[] args) {

		int locks=0,stocks=0,barrel=0,flag=0,t_sales=0;
		double commision;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter total number of locks:");
			locks = sc.nextInt();
			System.out.println("Enter total number of stocks:");
			stocks = sc.nextInt();
			System.out.println("Enter total number of barrels:");
			barrel = sc.nextInt();
		}
		catch(Exception e) {}
		if((locks<=0) || (locks>70)){
			flag =1;
		}
		if((stocks<=0)|| (stocks>80)) {
			flag=1;
		}
		if((barrel<=0)|| (barrel>90)) {
			flag=1;
		}
		if(flag==1) {
			System.out.println("Invalid input");
		}
		t_sales = (locks*45)+(stocks*30)+(barrel*25);
		if(t_sales<=1000) {
			commision = 0.10*t_sales;
		}
		else if(t_sales<1800) {
			commision = 0.10*1000;
			commision = commision+(0.15*(t_sales-1000));
		}
		else {
			commision = 0.10*1000;
			commision = commision+(0.15*800);
			commision = commision+(0.20*(t_sales-1800));
		}
		System.out.println("The Total Sales: "+t_sales+"\nThe Commission is: "+commision);
	}

}
