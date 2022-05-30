/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "Hospitales.data";

        Hospital h1 = new Hospital("Isidro Ayora", 500, 30500);
        Hospital h2 = new Hospital("UTPL", 350, 40200);
        Hospital h3 = new Hospital("San Jose", 450, 35000);
        
        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        archivo.establecerRegistroHospital(h1);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();

        
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);

    }
}
