public class MatrixExamples {
    public static void main(String[] args) {
    int[][] matrix=createMatrix();
    displayMatrix(matrix);
    }

    //-------
    public static int[][] createMatrix(){
        int[][] matrix={{1,5,7},{3,5,3}};
        return matrix;
    }

    //-------
    public static void displayMatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    //-------
    public static void isPerfect(int x){
        int toplam=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                toplam+=i;
            }
        }
        if(toplam==x){
            System.out.print("P");
        }
        else {
            System.out.print(x);
        }
    }
   //-------

    public static void displayMatrixAsPerfection(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                isPerfect(matrix[i][j]);
            }
            System.out.println();
        }
    }
    //-------
}
