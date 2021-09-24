/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;
import java.util.Scanner;
/**
 *
 * @author CBN
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double salario, retefuente= 0.03, salario2;
        Scanner pre = new Scanner(System.in);
        
        System.out.print("Ingrese su salario => $");
        salario = pre.nextDouble();
        
        if(salario > 942.000) {
            salario2 = salario*retefuente;
           System.out.println("Tiene que pagar impuestos");
           System.out.println("Salario $"+salario+" Descontado = $"+salario2);
           salario = salario-salario2;
           System.out.println("Salario final = $"+salario);
        } else {
            System.out.println("No tiene que pagar impuestos");
        }
        
    }
    
}
