package Day10_JDBC;

public class ClassForName
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("Abc");
		System.out.println("After creating instance");
		Class.forName("Abc").getDeclaredConstructor().newInstance();
		
		//In JDBC Driver class has the static block which contains Driver Registration
	}
	
}

class Abc
{
	static
	{
		System.out.println("In static block");
	}
	{
		System.out.println("In instance block");
	}
}