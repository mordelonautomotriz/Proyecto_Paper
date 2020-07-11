/*
        Diseño e implementación del modelo de conducción autónoma en un vehículo hibrido

Descripción:
“Mediante un modulo que es controlado por una red neuronal interna, el automóvil 
se moverá de manera autónoma mediante las señales emitidas por los sensores y cámaras 
ubicadas en sus respectivos sitios (frontal, laterales, trasera) del automóvil”.
 */
package proyecto2;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author HECTOR ORTIZ
 */
public class Proyecto2 {

    public static String Receptar_imagen_camara(String tipo_camara, String tipo_senial, int rango_sensibilidad){
        String receptar = "\nEl tipo de camara utilizada es una " + tipo_camara + " "
                + "posee una senial de tipo " + tipo_senial + " con un rango de sensibiliad " + rango_sensibilidad + "%";
       
 return receptar;
    }
    
    public static String Determinar_rangos_voltaje(int rango_voltaje ){
   
        int intensidad = 10 ;
        int resistencia = 5;
   rango_voltaje = intensidad*resistencia;
   String voltajes = "\nY Su rango de voltaje esta dentro del : " + rango_voltaje + "%";
    
    
    return voltajes;
}
    
    public static String Obtener_pulsos_sensor(String tipo_sensor, int rapidez_pulso){

        int frecuencia =10;
        int tiempo =999;
        rapidez_pulso = tiempo / frecuencia;
        
        String Rapidez_Pulsos = "\nEl tipo de sensor implementado es de" + tipo_sensor 
                + " que puede llegar a tener " + rapidez_pulso + " pulsos por segundo ";
        
        return Rapidez_Pulsos;
    }

    public static String Ejecutar_tarea_ordenada_red_neural(int velocidad_ejecucion, String tipo_modulo){
        
        String Ejecutar_Tarea = "\nLa velocidad de ejecucion ya biene dada por el fabricante, "
                + "\nno todos los modulos poseen la misma velocidad de ejecucion, "
                + "\npor ejemplo tenemos un tipo de modulo " + tipo_modulo + " que posee una velocidad "
                + "\nde ejecucion " + velocidad_ejecucion +"&" ;
        
        return Ejecutar_Tarea;
    }
    
    public static String Desplazar_Automovil( int eficiencia_conduccion, int distancia_conduccion, int velocidad_ejecucion){
        String Resultados = "\tRESUSLTADOS: "
                + "\n\nDespues de todo el proceso ejecutado y realizado por medio de los "
                + "\nordenadores tenemos una conduccion eficiente del " + eficiencia_conduccion +"% la"
                + "\ndistancia obtenida fue de " + distancia_conduccion + " metros, con una velocidad de ejecucion "
                + "\ndel " + velocidad_ejecucion +"%\n";
        return Resultados;
    }
    
public static void verificar(int eficiencia_conduccion, int distancia_conduccion, int velocidad_ejecucion, String tipo_camara, String tipo_senial, int rango_sensibilidad, String tipo_modulo, String tipo_sensor, int rapidez_pulso, int rango_voltaje){
    
   int rangos_voltaje = 100;
   int rapidez_pulsos = 99;
     
    if (rangos_voltaje >= rapidez_pulsos){
        
        System.out.println(Desplazar_Automovil( eficiencia_conduccion, distancia_conduccion, velocidad_ejecucion));
        System.out.println(Receptar_imagen_camara( tipo_camara, tipo_senial, rango_sensibilidad));
        System.out.println(Ejecutar_tarea_ordenada_red_neural( velocidad_ejecucion, tipo_modulo));
        System.out.println(Obtener_pulsos_sensor( tipo_sensor, rapidez_pulso));
        System.out.println(Determinar_rangos_voltaje( rango_voltaje ));
    }else{
        System.out.println("Verificar El Proceso de la Obtencion de Pulsos del Sensor");
    }
    
}
    /*        
     * @param args the command line arguments
    
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eficiencia_conduccion = 99;
        int distancia_conduccion = 4;
        int velocidad_ejecucion = 96;
        String tipo_modulo = "SMRT";
         int rango_sensibilidad=15;
        String tipo_camara="Infrarroja ADAS";
        String tipo_senial="Senoidal";
        String tipo_sensor=" PROXIMIDAD";
        int rapidez_pulso= 0;
       int rango_voltaje=0;
        verificar (eficiencia_conduccion, distancia_conduccion, velocidad_ejecucion, tipo_camara, tipo_senial, rango_sensibilidad, tipo_modulo, tipo_sensor, rapidez_pulso, rango_voltaje);
      
    }
    
}
