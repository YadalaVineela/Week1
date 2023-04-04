package week1.day2;
/*
 Algorithm
 1.take  number input
 2.check if number is negative or not
 3.if number is negative then multiply with -1
 4.dispaly output
 */
public class CovertNegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=-20;
		int negativeNumber;
		if(num<0)
		{
			negativeNumber=num;
			num=num*(-1);
			System.out.println("NegativeNumber is converted to positive"+negativeNumber+":"+num);
		}
		else
		{
			System.out.println("Number is already positive so no need of conversion");
		}

	}

}
