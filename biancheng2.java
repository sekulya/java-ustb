package test;

import java.util.Collection;
import java.util.Scanner;

public class biancheng2 {			
	private float date[] = new float[10] ;
	private float max;
	private float min;
	private float average;	
	
	public float[] getDate() {
		return date;
	}

	public void setDate(float[] date) {
		this.date = date;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public void init(float a[]){
		for(int i = 0;i<a.length;i++){
			date[i]  = a[i];
		}
	}

	public void process() { 
		float average = 0;
		float all = 0;
		for(int i = 0; i < 10; i++){
			all+=date[i];
		}
		average = all/10;
		float a[] = getDate();
		for(int i = 0;i<9;i++){
			for(int j = i+1;j<10;j++){
				if(a[i]>a[j]){
					float k = 0;
					k = a[i];
					a[i] = a[j];
					a[j] = k;
					//System.out.println("a[0]=" + a[0]);
				}
			}
		}
		float max = a[9];
		float min = a[0];
		setMax(max);
		setMin(min);
		//System.out.println("min=" + min);
		setAverage(average);
	}
	
	void print1(){
		for(int i = 0;i<5;i++){
			if(date[i]-(int)date[i]>0)
			System.out.print(date[i]+" ");
			else System.out.print((int)date[i]+" ");
		}
		System.out.println();
		for(int i = 5;i<10;i++){
			if(date[i]-(int)date[i]>0)
				System.out.print(date[i]+" ");
				else System.out.print((int)date[i]+" ");
		}
		System.out.println();
	}

	void print2(){
		if(getMax()-(int)getMax()>0)
			System.out.println("max = " + getMax());
		else
		System.out.println("max = " + (int)getMax());

		if(getMin()-(int)getMin()>0)
			System.out.println("min = " + getMin());
		else
			System.out.println("min = " + (int)getMin());
		if(getAverage()-(int)getAverage()>0)
			System.out.println("average = " + getAverage());
		else
			System.out.println("average = " + (int)getAverage());
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		biancheng2 arr = new biancheng2();
		float a[] = new float[10];
		for(int i = 0;i<10;i++){
			a[i]=scn.nextFloat();
		}
		arr.init(a);
		arr.print1();
		arr.process();
		arr.print2();
		
	}
		
}



