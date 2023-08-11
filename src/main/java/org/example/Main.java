package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*menu EPM Grandes Clientes
    1-ver tarifa
    2-mostrar consumo promedio
    3_mostrar picos de consumo
    4-mostrar factura
    5-Salir
     */
        //Declarando variables

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        Boolean esAdministrador;
        Double tarifaEnergia =null;
        Integer opcionMenu;
        String respuertaPerfil;
        final String contraseña = "1234admin*";
        String contraseñaAdmin;
        Integer numeroIntetos=0;
        Integer contadorEnergia=0;

        System.out.println("**********************");
        System.out.println("** Bienvenido a EPM **");
        System.out.println("**********************");
        System.out.print("Eres admin : ");
        respuertaPerfil = teclado.nextLine();

        //Procesos de login admin/empresa aplicando las condiciones

        if (respuertaPerfil.equalsIgnoreCase("si"))  {
            //System.out.print("Ingrese su password admin: ");

            do {
                System.out.print("Ingrese su password admin: ");
                contraseñaAdmin = teclado.nextLine();

                if (contraseñaAdmin.equals(contraseña)) {
                    numeroIntetos = 3;
                    System.out.print("contraseña correcta ingrese nuevo valor energia kw por hora: ");
                    tarifaEnergia = teclado.nextDouble();
                    System.out.print("Nuevo valor establecido  kw por hora energia : " + tarifaEnergia);
                } else {
                    System.out.println("Contraseña incorrecta intentalo de nuevo");
                    numeroIntetos++;
                }
            }while (numeroIntetos < 3) ;

                // Generando contadores para usuario empresa
                Integer calcularKwDias = 0;
                Integer picosEnergia = 0;
                // Integer sumaDias=0;

                do {
                    calcularKwDias++;
                    Integer numeroAleatorio = aleatorio.nextInt(401);
                   // sumaDias =sumaDias+numeroAleatorio; // Sumando dias
                    contadorEnergia=contadorEnergia+numeroAleatorio;
                    if (numeroAleatorio > 300) {
                        picosEnergia++;
                        System.out.println("su consumo es mayor de 300 "+picosEnergia);
                    } else {
                        System.out.println("Su consumo es normal");
                    }

                } while (calcularKwDias < 30);

                //opcion menu
                System.out.println("******************************");
                System.out.println("* Bienvenido al menu empresa *");
                System.out.println("******************************");
                System.out.println("1-Ver tarifa Energia");
                System.out.println("2-Mostrar consumo promedio");
                System.out.println("3-mostrar picos de consumo");
                System.out.println("4-Facutura");
                System.out.println("5-Salir");

                do {
                    System.out.println("Por favor degite su opcion");
                    opcionMenu=teclado.nextInt();

                    switch (opcionMenu) {
                        case 1:
                            System.out.println("señor usuario la tarifa establecidad actual kwh es: " + tarifaEnergia);
                            break;
                        case 2:
                            System.out.println("señor usurio consumo promedio de kwh energia es:" + contadorEnergia);
                            Double promedio = contadorEnergia / 30.0;
                            break;
                        case 3:
                            System.out.println("señor usuario sus picos de consumo generedos: " +picosEnergia);
                            break;
                        case 4:
                            Double totalPagar=contadorEnergia*tarifaEnergia;
                            System.out.println("señor usuario su total a pagar: "+totalPagar);
                            break;
                        default:
                            System.out.println("Ustede digito una opcion invalida");
                            break;

                    }

                }while (opcionMenu!=5);


        }else{
        }

        /*
            System.out.println("******************************");
            System.out.println("* Bienvenido al menu empresa *");
            System.out.println("******************************");

            System.out.println("Elije una opcion");

            System.out.println("1-Ver tarifa Energia");
            System.out.println("2-Mostrar consumo promedio");
            System.out.println("3-mostrar picos de consumo");
            System.out.println("4-Facutura");
            System.out.println("5-Salir");

            opcionMenu=teclado.nextInt();


            switch (opcionMenu){
                case 1:
                    System.out.print("La tarifa establecidad actual: ");
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    break;

            }*/

        }
}
