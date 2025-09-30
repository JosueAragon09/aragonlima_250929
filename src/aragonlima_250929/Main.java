/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aragonlima_250929;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //INICIAMOS LA VARIABLE REFERENCIA O PUNTERO
        BusquedaBinaria buscar = new BusquedaBinaria();
        //SE ESTABLECE UN ARREGLO UNIDIMENSIONAL
        int[] arreglo = {17,19,21,23,25,27,29,31};
        
        int[][] matriz = {
            {   1,  3,   5    },
            {   7,  9,   11   },
            {   13, 15,  17 }
        };
        //SE ESTABLECE UN VALOR A BUSCAR
        int a_buscar = 5;
        //SE IMPLEMENTA EL METODO CORRESPONDIENTE A LA BUSQUEDA DE VALORES EN
        //ARREGLOS UNIDIMENSIONALES Y MEDIANTE LA HERENCIA
        int posicion = buscar.BuscarEnteroArray(arreglo, a_buscar);
        
       if(posicion != -1){
           System.out.println("El valor "+ a_buscar + " esta en la posicion: "+ posicion );
       }else{
           System.out.println("No se encontro el valor "+ a_buscar );
       }
       
       
       //IMPLEMENTACION DEL METODO DE BUSQUEDA EN UNA MATRIZ
       buscar.BuscarEnteroMatriz(matriz, a_buscar);
      
        
    }
    
}
