package constructor;

public class A {
	
	A(){
		System.out.println("Defaulult Con");
	}
	A(int i)
	{
		System.out.println(i);
	}
	A(int i,String name)
	{
		System.out.println("Name = "+name);
		System.out.println(i);
	}
	A(String i,String name)
	{
		System.out.println("Name = "+name);
		System.out.println("Name = "+i);
		
	}
	public static void main(String args[])
	{
		A a1=new A();
		A a2=new A(10);
		A a3=new A(30,"Sayli");
		A a4=new A("Pratiksha","Sayli");
	}
	
}
