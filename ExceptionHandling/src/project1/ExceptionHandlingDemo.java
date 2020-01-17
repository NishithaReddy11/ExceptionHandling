package project1;
import java.io.*;
public class ExceptionHandlingDemo {

	public static void main(String[] args) throws IOException {//compile time exception
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		System.out.println("Enter value for a and b");
		try
		{
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		double x=a/b;
		System.out.println("Result is :"+x);
		}
		//catch(ArithmeticException e)
		//{
			//System.out.println("b shouldn't be 0");
		//}
		//catch(NumberFormatException ex)
		//{
			//System.out.println("Input should be integers only");
		//}  OR
		catch(ArithmeticException | NumberFormatException ee )
		{
			System.out.println("Error occurred is:"+ee.getMessage());
		}
		System.out.println("Done");
	}

}
