/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30_students;
import java.util.Scanner;
/**
 *
 * @author CBN
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notaf, ap = 0, rp = 0, ee;
        float prom = 0;
        Scanner nota = new Scanner(System.in);
        
        try {
            
            System.out.print("Ingrese cantidad de alumnos => ");
            ee = nota.nextInt();
        
        for(int i = 1; i <= ee; i++) {
            System.out.print("Ingrese la nota para el estudiante ["+ i +"] => ");
            notaf = nota.nextInt();
            
            if(notaf > 500 || notaf < 1) {
                System.out.println("Programa abortado! Numero fuera de la matriz");
                return;
            }
            
            if(notaf < 300) {
                rp++;
            } else if(notaf >= 300) {
                ap++;
            }
            
            prom = prom + notaf;
        }
        
        System.out.println("Cantidad de estudiantes aprovados: "+ ap +" Estudiantes");
        System.out.println("Cantidad de estudiantes reprobados: "+ rp +" Estudiantes");
        System.out.println("Promedio de notas: "+(prom/ee));
        
        } catch(Exception error) {
            System.out.println("Un error ocurrió: "+ error);
        };
    }
    
}
