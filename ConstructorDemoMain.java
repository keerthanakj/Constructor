package MyPkg;

class Product{
	int productid;
	String productname;
	
	//constructor with no-argument
	public Product(){ //name of the constructor should be same name as class
		                    //no return type
		                     //On object creation constructor is called
		                     //used to initialize the instance variable of a class
	
		
		productid=0;
		productname ="";
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
		
		
	}
	
	public Product(int i, String n) { //constructor with argument
		productid=i;
		productname=n;
	}
			
	void methodProudct() {
		System.out.println("MethodProduct");
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
		
	}
}

public class ConstructorDemoMain {
     
	public static void main(String[] args) {
		

		Product product1 =new Product(34,"Laptop");
		Product product2 =new Product(35,"Refrigirator");
		
		product1.methodProudct();
		product2.methodProudct();
	}

}
