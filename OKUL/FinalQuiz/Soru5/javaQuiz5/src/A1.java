public class A1 {
    public static void main(String[] args) {
        int[][] matrix={{2,3,4},{1,2,5}};
        int[][] z = a(matrix);
        list(z);
        int[][] r = m(z);
        list(r);
    }

    public static int[][] a(int[][] matrix){
        int[][] r=new int[matrix[0].length-1][matrix[0].length-1];
        for (int i=0; i<matrix.length;i++){
            for (int j=0;j<matrix[0].length-1;j++){
                r[i][j]=matrix[i][j];
            }
        }
        return r;
    }

    public static int[][] m(int[][] matrix){
        int[][] r=new int[matrix.length][matrix[0].length];
        for (int i=0;i<r.length;i++){
            r[i][0]=matrix[i][0];
        }
        return r;
    }

    public static void list(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
