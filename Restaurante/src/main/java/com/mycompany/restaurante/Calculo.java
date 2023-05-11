/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Calculo {
    double total=0;
    String datos="";
    public void Suma(double x , String tipo){
        
        Scanner res = new Scanner(System.in);
    
        int n =1;
        String comida = tipo;
        total=total+x;
        Calculo in = new  Calculo();
        
        datos=datos + comida + "*******" + x +"$" + '\n';
        System.out.println(datos + "ds" + total);
        Restaurante reinicio = new Restaurante();
        
        System.out.println("Deseas agregar otro prodcuto? \n 1 o 2 = s \n 3=n");
        n=res.nextInt();
        if(n==3){
            in.Ticket(datos,x);
        }
       }
        
        
    
    public void Ticket(String datos, double x){
        
        System.out.println("RESTAURANTE GARCIA");
        System.out.println("**********************");
        System.out.println("Lo que ha pedido es: ");
        System.out.println();
        System.out.println("El total de la suma es: ");
        System.out.println("ORDEN NUM 947287");
        System.out.println("\tMUCHAS GRACIAS");
        
    }
}
