public class ejerciciosMatricesClase {
    public static void main(String[] args) {
        int[][] miMatriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<miMatriz.length;i++){
            for(int j=0; j<miMatriz[i].length; j++){
                    System.out.print(miMatriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<miMatriz.length;i++){
            for(int j=0; j<miMatriz[i].length; j++){
                if( i == j){
                    System.out.print(miMatriz[i][j]+" ");
                }

            }
            System.out.println();
        }

    }
}
