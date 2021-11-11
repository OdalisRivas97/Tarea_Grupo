/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author Erik Vasquez
 */
public class Doctor extends Persona {

public Doctor(){
  getNombre("Dr. Miguel Ferrera");
  getCargo("Medico Interno");
  getLugar_Trabajo("Hospital Mario Catarino Rivas");
  getEdad(40);
  getEstatura("1.70 Metros");
  getPeso(180);
  getProfesion("Medico");       
  
}

    @Override
    public String setinformacionforma() {
    return "Informacion del Doctor";
    }


    }

