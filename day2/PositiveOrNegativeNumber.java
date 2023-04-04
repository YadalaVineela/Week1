package week1.day2;
/*
 positive or negative number
 
 algorithm:
 1.take input number
 2.check if number is >0 (positive) or<0(negative) or neither .
 3.print number as positive or negative 
 */
public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-10;
		if(num>0)
		{
			System.out.println(num+" "+"number is positive");
		}
		else if(num<0)
		{
			System.out.println(num+" "+"number is negative");
		}
		else
		{
			System.out.println(num+" "+"number is neither positive nor negative");
		}

	}

}
