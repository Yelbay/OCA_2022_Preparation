package q026;

public class FieldInit {
	Integer i;
	Character c;//if it is wrapper class then always null
	char ch;
	boolean b;
	float f;
	int arr;
	void printAll() {
		System.out.println("c = " + c);//null
		System.out.println("b = " + b);//false
		System.out.println("f = " + f);//0.0
		System.out.println("i = " + i);//null
		System.out.println("ch = " + ch);
		System.out.println("arr = " + arr);//null
	}
	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		f.printAll();
	}
}
//What is the result? 
//A. c=null b=true f=0.0 
//B. c= b=false f=0.0 
//C. c=null b=false f=0.0 
//D. c=0 b=false f=0.0F

