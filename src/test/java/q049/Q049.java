package q049;

public class Q049 {

	public static void main(String[] args) {
		int n[][] = {{1, 3}, {2, 4}};
		for (int i = n.length - 1; i >= 0; i--) {
			//for( int j=0; j<= n.length-1;j++)
			for (int y : n[i]) {
				System.out.println(y);
			}
				//System.out.print(n[i][j]);
			}
		}
	}



//What is the result?
//A.	1324
//B.	2313  // 2413
//C.	3142
//D.	4231
