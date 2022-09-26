package homework;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int min=Math.min(a, b) ;         
		for(int i=min;i>0;i--){     
			if(a%i==0&&b%i==0){   
				min=i;
				break;         
				}	
		}
		int max=a*b/min;       
		System.out.println(min+" "+max);
		


	}

}


