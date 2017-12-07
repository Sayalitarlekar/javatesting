package overlodaing;

public class Methodoverloading {
	
	public void add(int no1,int no2)
	{
	   	int sum=no1+no2;
	   	System.out.println(sum);
	}
	public void add(int no1,int no2,int no4)
	{
	   	int sum=no1+no2+no4;
	   	System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading a1= new Methodoverloading();
		a1.add(10,10);
		Methodoverloading a2= new Methodoverloading();
		a2.add(10,11,12);
		

	}

}
