/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;
/**
 *
 * @author adminibreq
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ex 2
       /* System.out.println("Hello world by oz");
        System.out.println("Ligne 2");*/
       
       //ex4
    Scanner sc = new Scanner(System.in);

    System.out.print("Saisir x : ");
    int x = sc.nextInt();

    System.out.print("Saisir y : ");
    int y = sc.nextInt();

    System.out.println("x = " + x + " et y = " + y);

    int z = x;
    x = y;
    y = z;

    System.out.println("x = " + x + " et y = " + y);


    }
}