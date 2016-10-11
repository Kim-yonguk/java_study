package Study;
import java.util.Scanner;
import java.util.*;

public class Quick {

	public static void main(String[] args) {
		
		
		int a=20;
		
		
		Scanner sc=new Scanner(System.in);

		try
		
		{	
		System.out.print("피제수를 입력하시오 : ");
		String num1=sc.nextLine();
		System.out.print("제수를 입력하시오 : ");
		String num2=sc.nextLine();
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		Numerror(n1,n2);
		System.out.println("결과값은 : " + n1/n2);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌수 없습니다.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("타입이 일치하지 않습니다.");
		}
		catch(Exception e)
		{
			System.out.println("범위가 일치하지 않습니다.");
		}
		
		
		}
		
	public static void Numerror(int num1,int num2)throws Exception
	{
		if((num1>=100)||(num2>=100))
		{
			throw new Exception();
		}
	}

}
