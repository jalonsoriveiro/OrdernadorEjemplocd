/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exobxatributos;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class ExObxAtributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        Alumno a1 = new Alumno();
        a1.amosar();
        System.out.println("nome :");
        String nome = sc.nextLine();
        System.out.println("nota :");
        int nota = sc.nextInt();
        System.out.println("Email :");
        String email = sc.next();
        System.out.println("Telefono :");
        String telefono = sc.next();
        Direccion d = new Direccion(email,telefono);
        Alumno a2 = new Alumno(nome,nota,d);
        System.out.println("-----");
        //tamen
        //Alumno a2 = new Alumno(nome,nota,new Direccion(email,telefono));                        
       // a2.amosar();
        //
      // a2.getNome();
      /* 
      System.out.println(" Nome:"+a2.getNome()+" \nNota:"+a2.getNota()+" "
                + "\nEmail:"+a2.getDire().getEmail()+" \nTelefono:"+a2.getDire().getTelefono());
        
       */ 
        
        //String var1=
        //String var1 = a1.toString();
        
        System.out.println(a2);
    }   
    
}
