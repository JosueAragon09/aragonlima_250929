/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aragonlima_250929;

/**
 *
 * @author UFG
 */

//ESTA CLASE SE CONVERTIRÁ EN UN OBJETO
public class BusquedaBinaria {
    
    
    //METODO PARA HACER UNA BUSQUEDA BINARIA DE UN ARREGLO UNIDIMENSIONAL
    
    public int BuscarEnteroArray(int[] arreglo, int valorBuscado){
        
        //SE DECLARAN VARIABLES DE INICIO Y DE FIN
        int inicio = 0;
        int fin = arreglo.length;
        
        
        //SE INICIA LA BUSQUEDA SI EL ARREGLO TIENE AL MENOS UN ELEMENTO
        while (inicio <= fin){
            
            //SE OBTIENE LA POSICION DEL CENTRO DEL ARREGLO
            int medio = (inicio + fin)/2;
            
            //SE EVALUA SI EL CENTRO DEL ARREGLO ES IGUAL AL VALOR BUSCADO
            if(arreglo[medio] == valorBuscado){
                
                //SI ES IGUAL, SE DEVUELVE LA POSICION DONDE SE ENCONTRO
                return medio;
                
            //SE EVALUA SI EL ELEMENTO EN LA POSICIÓN MEDIA ES MENOR AL VALOR BUSCADO
            }else if(arreglo[medio] < valorBuscado){
                
                //SI ES MENOR, EL VALOR DEL INICIO SE MUEVE HASTA EL CENTRO
                inicio = medio + 1;
                
                
            //SI EL VALOR DEL MEDIO ES MAYOR, SE EJECUTA OTRA ACCIÓN
            }else{
                
                //SI ES MAYOR, EL VALOR DEL FIN DE MUEVE HASTA LA POSICIÓN DEL CENTRO
                fin = medio - 1;
                
            }
            
            
        }
        
        //SE DEVUELVE -1 CUANDO NO HAY VALORES ENCONTRADOS
        return -1;
    }
    
    
    
    //SE CREA METODO PARA HACER BUSQUEDA DE MATRIZ
    public void BuscarEnteroMatriz(int[][] matriz, int objetivo){
        
        //SE DECLARAN FILAS Y COLUMNAS
        int filas = matriz.length; 
        int columnas = matriz[0].length;
        
        //SE DECLARAN INICIO Y FIN
        int inicio = 0;
        
        //CANTIDAD TOTAL DE ELEMENTOS EN LA MATRIZ
        int fin = (filas * columnas) - 1;
        
        //BANDERA QUE INDICA SI EL VALOR FUE ENCONTRADO O NO
        boolean encontrado = false;
        
        
        //SE HACE ITERACION MIENTRAS LA MATRIZ TENGA ALMENOS UN ELEMENTO
        while(inicio <= fin){
            
            //SE DEDUCE EL PUNTO MEDIO DE LA MATRIZ
            int medio = (inicio +  fin)/2;
            
            //SE SIMULA EL ARREGLO BIDIMENSIONAL COMO UN ARREGLO UNIDIMENSIONAL
            
            int f = medio/columnas; //¿CUAL FILA ES? (CUANTAS FILAS COMPLETAS EXISTEN ANTES DEL PUNTO MEDIO)
            int c = medio % columnas; //¿CUAL COLUMNA ES? (POSICION EXACTA DE LA COLUMNA)
            
            //SE EVALUA SI EL ELEMENTO ESTÁ EN EL CENTRO DE LA MATRIZ
            if(matriz[f][c] == objetivo){
                System.out.println("En la matriz, el elemento buscado esta en la posicion ["+ f+"] ["+c+"]" );
                //LA BANDERA SE COLOCA COMO VERDADERO SI EL ELEMENTO ES ENCONTRADO
                encontrado = true;
                break;
              //SE EVALUA SI EL ELEMENTO ES MAYOR AL MEDIO DE LA MATRIZ
            }else if(matriz[f][c] < objetivo){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }//FIN DEL WHILE
        
        
        //SE EVALUA LA BANDERA POR SI NO SE ENCONTRÓ EL ELEMENTO
        if(encontrado == false){
        System.out.println("El elemento buscado no ha sido encontrado en la matriz");
    }
    }//FIN DEL METODO DE BUSCAR EN MATRIZ
    
}
