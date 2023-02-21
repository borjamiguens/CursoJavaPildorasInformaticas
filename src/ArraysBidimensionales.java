public class ArraysBidimensionales {

    public static void main(String[] args) {

        int contadorElementos=0;
        int [][] matrix=new int[4][5];

        for(int i=0; i< 4; i++){
            for (int j=0; j<5; j++){
                matrix[i][j]=(int)Math.round(Math.random()*100);
            }
        }

        for(int i=0; i< 4; i++){
            System.out.println();
            for (int j=0; j<5; j++){
                System.out.print(matrix[i][j] + " ");
                contadorElementos=(i+1)*(j+1);
            }

        }

        System.out.println("El número de elementos es: " + contadorElementos);
        System.out.println(matrix[3][4]);

    }

}
