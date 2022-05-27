/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {

        Empresa e1 = new Empresa("Head and Shoulders", "Manabi");
        Empresa e2 = new Empresa("Panini", "Quito");
        Empresa e3 = new Empresa("Gillet", "Cuenca");

        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);

        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < empresas.size(); i++) {
            // Nombre Empresa
            // Nombre Ciudad
            System.out.printf("%s - %s\n",
                    empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());

        }
    }
}
