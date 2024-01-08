package demopkg;

import java.text.NumberFormat;
import java.util.Scanner;

public class Morgage_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numbers=new int[5];
		//int[] numbers= {12,3,4};
		//System.out.println(numbers);
		//using final keyword before variable name we can create constants
		final byte MONTHS_IN_YEAR =12;
		final byte PERCENT =100;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter principal:");
		int principal=scanner.nextInt();
		System.out.println("enter interest rate:");
		float annualrate=scanner.nextFloat();
		float monthlyrate=annualrate/PERCENT/MONTHS_IN_YEAR;
		System.out.println("enter period per yrs:");
		byte yr=scanner.nextByte();
		int numberofpayments=yr*MONTHS_IN_YEAR;
		double mortgage = principal*(monthlyrate*(Math.pow(1+monthlyrate, numberofpayments))/
				(Math.pow(1+monthlyrate, numberofpayments)-1));
		String mortageformatted= NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortage :"+mortageformatted);
		
	}

}
