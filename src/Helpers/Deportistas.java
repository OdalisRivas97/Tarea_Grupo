/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author HP
 */
public class  Deportistas extends Persona{
 
 public Deportistas(){
 getNombre("Ricardo Canales");
 getCargo("Portero");
 getLugar_Trabajo("CDS Vida");
 getEdad(25);
 getEstatura("1.75 Metros");
 getPeso(170);
 getProfesion("Futbolista Profesional");
}

    @Override
    public String setinformacionforma() {
    return "Informacion del Deportista";
    }

}
