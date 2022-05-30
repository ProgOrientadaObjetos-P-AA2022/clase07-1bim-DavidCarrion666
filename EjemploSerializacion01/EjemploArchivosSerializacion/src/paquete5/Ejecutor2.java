/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
     public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/Hospitales.txt";
        String cedula_buscar = "UTPL";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(cedula_buscar);
        lectura.establecerProfesorBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
}
