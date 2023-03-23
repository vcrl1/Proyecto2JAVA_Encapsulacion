package com.adecco.modelo;

public class Producto {
    //1.Atributos
    private int numProduct;
    private String nombre;
    private double precio;
    private int existencias;


    //2.Métodos
    //3.Constructores
    //4. Setters y Getters
        //Setter: sirve para asignar valor al atributo.
            //Tengo datos de entrada.
    public void setNumProduct(int numProduct){
        this.numProduct=numProduct;
        //Atributo=lo que guardo lo paso a mi atributo
    }
        //Getter: Tiene que devolver un valor.
    public int getNumProduct(){
        return numProduct;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
    public void setExistencias(int existencias){
        this.existencias=existencias;
    }
    public int getExistencias(){
        return existencias;
    }

}
