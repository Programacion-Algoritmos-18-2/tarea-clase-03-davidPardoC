/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author David Pardo
 */
public class Principal {
    public static void main(String[] args) {
        double sueldo=0;
        double sueldo_semanal[] = new double[4];
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("(1) Ingresar datos semanalmente \n (2) Ingresar Valor mensual: ");
        int opcion = scanner.nextInt();
        switch(opcion) {
        case(1):
            for (int i = 0; i < 4; i++) {
                System.out.println("Ingresar suledo semana "+(i+1)+":");
                sueldo_semanal[i]=scanner.nextDouble();              
            }
            t.agregar_sueldo(sueldo_semanal);
            break;
        case(2):
            System.out.println("Ingresar sueldo mensual:");
            sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
            break;
        }
        
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());          
    }
    }

