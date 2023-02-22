import java.math.*;
public class MatrixMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way to define a matrix 
		int [][] mat = {{1,2},
						{3,4}};
		
		
		for(int i=0; i<2; i++) {
			for (int j = 0; j<2 ; j++) {
				System.out.println(mat[i][j]);
			}
		}
		
		//second way to define a matrix
		int[][] mat2 = new int[2][2];
		mat2[0][0] =1;
		mat2[0][1] =2;
		mat2[1][0] =3;
		mat2[1][1] =4;
		
		int r = 1 ; 
		int c = 4 ; 
		
		int x = r*c; 
		
		System.out.println("------------------------");
		System.out.println(x); 
		
		int m = mat.length; // gets us 2 // rows
		int n = mat[0].length; // gets us 2 // cols 
		
		System.out.println("------------------------");
		
		System.out.println(m); 
		System.out.println(n); 
		
		System.out.println("------------------------");
		
		if (m*n == x) System.out.println("True");
		else {System.out.println("false");}

		System.out.println("------------------------");
		
		int k = 3;
		System.out.println((k+0)%7);
		System.out.println(3%6);
		
		System.out.println("------------------------");
		System.out.println(12321%10);
		
		System.out.println("------------------------");
		int minBuy = Integer.MAX_VALUE;
		System.out.println(minBuy);

		System.out.println("------------------------");
		
		String s = "aabbccddeef"; 
		//declare array char_counts of 128 integers (0-127)
		// its 128, so we get the entire ascii table 
		int [] char_counts = new int[128]; 
		//recives integer and follows ascii table 
		char c4 = 60;
		
		for(char c1 : s.toCharArray()){
	            char_counts[c1]++;
	        }
		
		System.out.println(char_counts[100]);
		System.out.println(c4);
		
		System.out.println("------------------------");
		System.out.println(6%4);


	}

}
