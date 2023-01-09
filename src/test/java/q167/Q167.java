package q167;

public class Q167 {
	public static void main(String[] args) {
		
	
	int x= 100;
	int a=x++;//a=100
	int b=++x;//b=102
	int c=x++;//102 x=103
	int d= (a<b)? (a<c)? a: (b<c) ? b: c: x;
	System.out.println(d);
	
	}
}
/**
 * What is the result?
A. 100
B. 101
C. 102
D. 103
E.Compilation fails
*/
