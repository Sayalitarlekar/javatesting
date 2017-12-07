package overlodaing;

public class constructoroverloading {
	 constructoroverloading()
     {
     System.out.println("This is default consuctor");
     }
     constructoroverloading(int x,String y)
     {
    	 System.out.println(x);
    	 System.out.println(y);
      }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		 constructoroverloading a1=new constructoroverloading();
		 constructoroverloading a2=new constructoroverloading(10,"Testing");
		}
}
