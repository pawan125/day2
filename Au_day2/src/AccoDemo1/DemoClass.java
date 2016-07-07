package AccoDemo1;

import java.util.Scanner;
/*author is pawan*/
public class DemoClass implements Calculator {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return  a + b;
	}

	@Override
	public Integer subtract(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public Long multiply(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (long) (a * b);
	}

	@Override
	public Integer divide(Integer a, Integer b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a / b;
	}

	public static void main(String[] args) {
		Calculator cal = new DemoClass();
		Integer a, b, choice;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a and b");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("press 1 for add \npress 2 for subtract \npress 3 for multiply \npress 4 for divide ");
		choice = input.nextInt();
		 switch(choice) {
		 case 1:
			 System.out.println(cal.add(a, b));
			 break;
		 case 2:
			 System.out.println(cal.subtract(a, b));
			 break;
		 case 3:
			 System.out.println(cal.multiply(a, b));
			 break;
		 case 4:
			 try{
				 System.out.println(cal.divide(a, b));
			 } catch (ArithmeticException e) {
				 System.out.println("infinity");
			 }			 
			 break;
		default:
			System.out.println("incorrect input");				
		 }
		 input.close();
	}
}
