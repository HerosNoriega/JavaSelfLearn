public class ForEach{

    public static void main(String[] args){


        //Definimos un array de 3 filas x 5 columnas
        int array[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        //Recorremos el array multidimensional
        for (int[] arrayInterno : array) {
            for (int numero : arrayInterno) {
                System.out.println(numero);
            }
        }

        //Definimos un array de 2 de altura, 3 filas X 5 columnas
        int array3d[][][] = {
                              { {1,2,3,4,5} ,
                                {6,7,8,9,10},
                                {11,12,13,14,15}
                              } ,

                              { {16,17,18,18,20},
                                {21,22,23,24,25},
                                {26,27,28,29,30}
                              }
                            };

        //Recorremos el array 3D con un for each
        for (int[][] columnaArray : array3d) {
          for (int[] arrayInterno : columnaArray) {
              for (int numero : arrayInterno) {
                  System.out.println(numero);
              }

            }

        }
    }


}
