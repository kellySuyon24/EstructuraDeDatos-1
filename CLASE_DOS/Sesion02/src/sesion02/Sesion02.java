/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion02;

/**
 *
 * @author Marco
 */
public class Sesion02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 
        int nCantidadDatos = 200000;
        int nValorMinimo = 0;
        int nValorMaximo = 100000;
        
        int[] oArreglo = new int[nCantidadDatos];
        
        Ordenamiento oClsOrdenamiento = new Ordenamiento();
        
        System.out.println("Ejemplo Ordenamiento\n");
        
        oArreglo = oClsOrdenamiento.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
        
       // Impresion de Arreglo
       System.out.println("\n");
       System.out.print("Arreglo Aleatorio\n");
        for (int n : oArreglo) {
            System.out.print( " " + n);
        }
        //
        
        long nInicioTiempo = System.currentTimeMillis();
        
        Ordenamiento.QuickSort(oArreglo, 0, oArreglo.length - 1);
        
        long nRetardoTiempo = System.currentTimeMillis() - nInicioTiempo ;
        
        System.out.println("\n");
        System.out.println(nRetardoTiempo);
        
        System.out.println("\n");
        // Ordenamiento por QuickSort
        System.out.println("Arreglo Ordenado\n");
          for (int n : oArreglo) {
            System.out.print( " " + n);
        }
        
          
        
    }
    
}
