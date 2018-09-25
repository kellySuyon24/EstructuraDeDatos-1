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
public class Ordenamiento {
    
    // Burbuja
    // Seleccion
    // Shell
    // QuickSort
    
    public int[] DevuelveArreglo(int nValores,int nMinimo, int nMaximo){
        
        int[] numeros = new int[nValores];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = DevuelveNumeroAleatorio(nMinimo,nMaximo);
        }
        
        return numeros;
    }
    
    private int DevuelveNumeroAleatorio(int nMinimo, int nMaximo)
    {
        int nValorDevuelto = 0;
        
        nValorDevuelto = (int) (Math.random()*(nMaximo - nMinimo));
        
        return nValorDevuelto;
    }
    
    public static void QuickSort(int[] vector, int izquierda,int derecha)
    {
        int pivote,i,j,auxintercambio =0;
        
        pivote= vector[izquierda];
        i = izquierda;
        j = derecha;
        auxintercambio =  0;
        
        while (i < j) {            
            
            while ( vector[i] <= pivote && i < j ) {
                i++;
            }
            while ( vector[j] > pivote  ) {
                j--;
            }
            if ( i < j ) {
                auxintercambio = vector[i];
                vector[i] = vector[j];
                vector[j] =  auxintercambio;
            } 
        }
        
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        
        if ( izquierda < j - 1 ) {
                QuickSort(vector, izquierda, j-1);
            }
        if ( j +1  < derecha ) {
                QuickSort(vector, j+1, derecha);
            }
    }
}
