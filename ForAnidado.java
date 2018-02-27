public class ForAnidado{
    public static void main(String[] args){

        //Definimos un array de 3 filas x 5 columnas
        int array[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        //Recorremos el array multidimensional
        for(int i= 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.println(array[i][j]);
            }
        }
        System.out.println("Termina el for recorrido en el array 2D");
        System.out.println();

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

        //Recorremos el array 3D con un for anidado
        for (int n = 0; n < 2 ; n++ ) {
          for(int i= 0; i < 3; i++){
              for(int j = 0; j < 5; j++){
                  System.out.println(array3d[n][i][j]);
              }
            }
          }
        System.out.println("Termina el for recorrido en el array 3D");

        }
      }
