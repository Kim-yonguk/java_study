package Study;
import java.util.Scanner;
import java.util.*;

public class Quick {

	public static void main(String[] args) {
		
		
		int a=20;
		
		
		Scanner sc=new Scanner(System.in);

		try
		
		{	
		System.out.print("�������� �Է��Ͻÿ� : ");
		String num1=sc.nextLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		String num2=sc.nextLine();
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		Numerror(n1,n2);
		System.out.println("������� : " + n1/n2);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("0���� ������ �����ϴ�.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Ÿ���� ��ġ���� �ʽ��ϴ�.");
		}
		catch(Exception e)
		{
			System.out.println("������ ��ġ���� �ʽ��ϴ�.");
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
