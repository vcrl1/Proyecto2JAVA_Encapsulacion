
package com.adecco.presentacion;

import com.adecco.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setNumProduct(1); //si no devuelve
        System.out.println("ID producto: "+ p1.getNumProduct()); //si devuelve
        p1.setNombre("Ratón inalámbrico");
        System.out.println("Nombre del producto: "+p1.getNombre());
        p1.setPrecio(14.50);
        System.out.println("El precio del "+p1.getNombre()+ " es: "+p1.getPrecio()+" euros.");
        p1.setExistencias(30);
        System.out.println("La cantidad de "+p1.getNombre()+ " es de "+p1.getExistencias());
    }
}


