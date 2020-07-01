package learning.selenium;

public class CallingInterfaceMethods implements Default_Static{

	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(
			String[] args)
	{
	CallingInterfaceMethods obj = new CallingInterfaceMethods();
	Default_Static.myMethod();
	obj.interfaceMethod();
	obj.myAbstractMethod();
	}
	

}
