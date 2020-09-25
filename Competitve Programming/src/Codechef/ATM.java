package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in)); 
		int amount_to_withdraw=Integer.parseInt(br.readLine());
		double balance=Double.parseDouble(br.readLine());
		double amount_to_be_deducted=(double) (0.50+amount_to_withdraw);
		
		if(amount_to_be_deducted<=balance && amount_to_withdraw%5==0)
		balance=balance-amount_to_be_deducted;
		
		System.out.println(String.format("%.2f", balance));
		
		
	}

}
