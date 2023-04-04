package week1.day2;
/*
 * Fibanocci series
 * 1.take input series count and three variables f0,f1,f2
 * 2.store first number and second number as 0,1 ...lets say f0=0,f1=1
 * 3.third number is formed by adding first & second...lets say f2=f0+f1
 * 4.then assign second number to first....f0=f1
 * 5.third number to second ....f1=f2
 * 6.now form the series till the count using for loop
 */

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		int f0,f1,f2;
		f0=0;f1=1;
		System.out.println(f0);
		for(int i=1;i<=count;i++)
		{
			f2=f0+f1;
			System.out.println(f2);
			f0=f1;
			f1=f2;
			
			
		}
				

	}

}
