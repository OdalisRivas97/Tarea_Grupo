/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioherencia_tarea2;

import Helpers.Circulo;
import Helpers.Cuadrado;
import Helpers.Linea;
import Helpers.Triangulo;

/**
 *
 * @author Erik Vasquez
 */
public class EjercicioHerencia_Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Linea linea = new Linea();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println(circulo.setinformacionforma());
        circulo.imprimirinformacioncirculo();
        System.out.println("\n");
        
        System.out.println(triangulo.setinformacionforma());
        triangulo.imprimirinformaciontriangulo();
        System.out.println("\n");
        
        System.out.println(linea.setinformacionforma());
        linea.imprimirinformacionlinea();
        System.out.println("\n");
        
        System.out.println(cuadrado.setinformacionforma());
        cuadrado.imprimirinformacioncuadrado();
        System.out.println("\n");
        
    }
    
}
