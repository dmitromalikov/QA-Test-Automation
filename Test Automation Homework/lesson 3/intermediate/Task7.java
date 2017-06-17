package intermediate;

public class Task7 {
	public static void main(String[] args) {
		int n = 2;
	    int[][] A,B,C;
	    A = new int[n][n];
	    B = new int[n][n];
	    C = new int[n][n];
	    int i,j;
	    
        System.out.println("Addition of matrices.\n"
        		+ "Add two matrix according to the common math rules and print the output to the console .");
        System.out.println("======================= Solution ==============================");
        
	    System.out.println("Matrix A : ");
	    for(i = 0; i < n; i++){
	        for(j = 0; j < n; j++){
	            A[i][j] = (int)(Math.random() * n * 10);
	            System.out.print(A[i][j] + (j == n - 1?"\n":"\t"));
	        }
	    }
	    System.out.println("Matrix B : ");
	    for(i = 0; i < n; i++){
	        for(j = 0; j < n; j++){
	            B[i][j] = (int)(Math.random() * n * 10);
	            System.out.print(B[i][j] + (j == n - 1?"\n":"\t"));
	        }
	    }

	    System.out.println("Sum of matrix A + B : ");
	    for(i = 0; i < n; i++){
	        for(j = 0; j < n; j++){
	                C[i][j] = A[i][j] + B[i][j];
	                System.out.print(C[i][j] + (j == n - 1?"\n":"\t"));
	        }
	    }
	}
}
