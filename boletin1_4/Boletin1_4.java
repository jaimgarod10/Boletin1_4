
package boletin1_4;

import java.util.Scanner;


public class Boletin1_4 {

    
    public static void main(String[] args) {
        // leer dos numeros
        Scanner sc= new Scanner(System.in);
        System.out.println("num1: ");
        float num1= sc.nextFloat();
        System.out.println("num2: ");
        float num2= sc.nextFloat();
        float s= num1+num2;
        float r= num1-num2;
        float p= num1*num2;
        float d= num1/num2;
        System.out.println("s= " + s);
        System.out.println("r= " + r);
        System.out.println("p= " + p);
        System.out.println("d= " + d);
    }
    
}
