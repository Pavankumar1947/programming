package arrayBased;

public class MatrixColumnWise {
	
	public static void main(String[] args) {
		
		
		int [][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		int rows =matrix.length;
		int cols = matrix[0].length;
		
		
		for(int i=0; i< cols; i++) {
			for(int j=0; j< rows; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}

}
