package q050;

public class Q050 {
//  Which two code fragments cause compilation errors? (Choose two.)
	public static void main(String[] args) {
		double y1 = 3.22;
	//	float fit = y1; //Type mismatch: cannot convert from double to float

		float fit1 = (float) 1_11.0;
		System.out.println(fit1);
		float fit2  = (float) 100.00; 						// Type mismatch: cannot convert from double to Float

		int y2 = 100;
		float fit3= y2;

		float fit4 = 100.00F;
//		int i=256;
//		byte b=(byte)i; not accepted result 0
//		System.out.println(b);
	}
}
