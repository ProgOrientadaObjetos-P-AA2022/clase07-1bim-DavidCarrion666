/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        
        Calificacion cal1 = new Calificacion(9, "Quimica");
        Calificacion cal2 = new Calificacion(7, "Biologia");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        cal1.establecerProfesor(prof1);
        cal2.establecerProfesor(prof2);
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Calificacion> calificaciones = new ArrayList<>();
        calificaciones.add(cal1);
        calificaciones.add(cal2);
        
        for (int i = 0; i < calificaciones.size(); i++) {
            // Nombre Profesor
            // Nombre de la Materia
            // La nota
            
            System.out.printf("%s - %s (%.2f)\n", 
                    calificaciones.get(i).obtenerProfesor().obtenerNombre(),
                    calificaciones.get(i).obtenerNombreMateria(),
                    calificaciones.get(i).obtenerNota());
        }
        
       
        }
    }

