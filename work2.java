package homework;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner N=  new Scanner(System.in);
		int n = N.nextInt();
		for( int i=100;i<=n;i++){
			 int a =i/100;
	         int b =i/10%10;
	         int c =i%10;
	            if(i==a*a*a+b*b*b+c*c*c)
	                System.out.println(i);
		}
		
	}
}


