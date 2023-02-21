public class ArraysBidimensionalesForeach {

    public static void main(String[] args) {

        int [][] matrix=new int[4][5];

        for(int i=0; i< 4; i++){
            for (int j=0; j<5; j++){
                matrix[i][j]=(int)Math.round(Math.random()*100);
            }
        }

        for (int[] fila:matrix){

            System.out.println();

            for (int z: fila){

                System.out.print(z + " ");

            }

        }

    }
}
