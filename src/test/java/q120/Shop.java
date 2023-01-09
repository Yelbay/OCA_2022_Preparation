package q120;

class Cart {

	Product p;
	double totalAmount;	
	}
	
class Product {
	String name;
	Double price;
}

 public class Shop {
	public static void main(String[] args) {
	
		Cart c = new Cart();

		System.out.println(c.p + ":" + c.totalAmount );//c double primitive double o yuzden 0.0
		//Product a=new Product(); bunlari ben koydum
		//System.out.println(a.name + ":" + a.price );//null:null bunu ben koydum Wrapper class null olur Double bile olsa
	}

}
/*What is the result?
A. null:null:0.0
B. null:null
C. <<HashCode>>:0.0
D. null:0.0
Answer: D
*/