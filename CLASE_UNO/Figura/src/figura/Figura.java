/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;
import java.io.*;
/**
 *
 * @author Marco
 */
public class Figura implements FiguraInterface {

    /**
     * Cuando una clase implementa una interfaz esta obliga a cumplir todos los
     * contratos de la interfaz
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area = 0;
      // tipo de dato nombre_variable = palabra reservada(new) tipo de dato(alcance)
        
        // instancia de la clase figura
        Figura ofigura = new Figura();
        
        //  Instanciando la Clase Circulo
        Circulo ocirculo = new Circulo();
        ocirculo.set_Radio(5);
        
        area = ofigura.CalculoArea(ocirculo);
        
        System.out.println(" El Area del Circulo es : " + area);
        
        // Instancias la Clase Triangulo
        Triangulo oTriangulo = new Triangulo(5.2,2.4);
            
        area = ofigura.CalculoArea(oTriangulo);
        
        System.out.println(" El Area del Triangulo es : " + area);
        
        
        // Los Datos de Entrada que se ingresen desde teclado.
        // Completar para el area del rectangulo.
        
    }
    
    // 
    public double CalculoArea(Object obj) {
        double area = 0;
            
        //System.out.println(obj.getClass().getSimpleName());
        
        switch (obj.getClass().getSimpleName())
        {
            case "Circulo":
               // convierte el objeto obj recibido por parametro 
                // en la clase instaciada circulo.
               Circulo oCirculo = (Circulo) obj;
                
                area =  Circulo.PI*Math.pow(oCirculo.get_Radio(), 2); 
               
               break;
            
            case "Triangulo":
                 
                Triangulo oTriangulo = (Triangulo) obj;
                 
                area = oTriangulo.GetBase()*oTriangulo.GetAltura()/2;
               
            default: 
                
                break;
        }
        
        
        return area;
    }
    
}
