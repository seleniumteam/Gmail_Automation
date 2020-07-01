package learning.selenium;

public interface Default_Static {
	
	
	public default int interfaceMethod()
	
	{
		int a,b,c;
		a = 10;
		b=  20;
		c = a +b;
		return c;
		
	}
	
	public static String myMethod()
	{
		String a = "Learning Interface concepts";
		return a;
	}
	
	
	public void myAbstractMethod();
	
	
	

}
