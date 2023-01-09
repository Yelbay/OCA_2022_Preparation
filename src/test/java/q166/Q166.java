package q166;

public class Q166 {

	public static void main(String[] args) {
		int x=100;
		int a=x++;//a=100 x=101
//		System.out.println(a);//100
		int b=++x;//b=102 x=102
		int c =x++;//c=102 x=103
		int d=(a<b) ? (a<c)? a:(b<c)? b: c: x;
		System.out.println(d);
	}

}
