/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author Erik Vasquez
 */
public abstract class Persona {
private String Nombre;
private String Cargo;
private String Lugar_Trabajo;
private int Edad;
private String Estatura;
private int Peso;
private String Profesion;

public Persona(){
}

public void getNombre(String Nombre){
    this.Nombre = Nombre;
}

public String setNombre (){
    return this.Nombre;
}

public void getCargo(String Cargo){
    this.Cargo = Cargo;
}

public String setCargo (){
    return this.Cargo;
}
public void getLugar_Trabajo(String Lugar_Trabajo){
    this.Lugar_Trabajo = Lugar_Trabajo;
}

public String setLugar_Trabajo (){
    return this.Lugar_Trabajo;
}
public void getEdad(int Edad){
    this.Edad = Edad;
}

public int setEdad (){
    return this.Edad;
}
public void getEstatura(String Estatura){
    this.Estatura = Estatura;
}

public String setEstatura (){
    return this.Estatura;
}
public void getPeso(int Peso){
    this.Peso = Peso;
}

public int setPeso (){
    return this.Peso;
}
public void getProfesion(String Profesion){
    this.Profesion = Profesion;
}

public String setProfesion (){
    return this.Profesion;
}
public abstract String setinformacionforma();   


public void imprimirinformacionDoctor(){
    System.out.println("Nombre : " +Nombre);
    System.out.println("Cargo : " +Cargo);
    System.out.println("Lugar de trabajo : " +Lugar_Trabajo);
    System.out.println("Edad : " +Edad);
    System.out.println("Estatura : " +Estatura);
    System.out.println("Peso : " +Peso);
    System.out.println("Profesion : " +Profesion);
    
}
public void imprimirinformacionDeportista(){
    System.out.println("Nombre : " +Nombre);
    System.out.println("Cargo : " +Cargo);
    System.out.println("Lugar de trabajo : " +Lugar_Trabajo);
    System.out.println("Edad : " +Edad);
    System.out.println("Estatura : " +Estatura);
    System.out.println("Pso : " +Peso);
    System.out.println("Profesion : " +Profesion);
}
}