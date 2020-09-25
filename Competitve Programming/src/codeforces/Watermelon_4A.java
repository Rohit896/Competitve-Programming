package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon_4A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
     
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in)); 
		
		int weightOfWatermelon=Integer.parseInt(br.readLine());
		
		if(weightOfWatermelon>=1 && weightOfWatermelon<=100)
		{
		if(weightOfWatermelon==1 || weightOfWatermelon==2)
			System.out.println("NO");
		else
		{
			if(weightOfWatermelon%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		}
		
	}

}
