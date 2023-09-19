package org.example;

import java.util.Scanner;

public class Primos {

    public void numerosPrimos(){
        System.out.println("BUSCADOR DE PRIMOS");
        System.out.println("==================");



        Scanner sc = new Scanner(System.in);

        int inicio=1;
        int contador=0;

        while(inicio!=0){
            System.out.println("Escriba el numero inicial (0 para salir)");
            inicio = sc.nextInt();
            System.out.println("Escriba el numero final");
            int fin = sc.nextInt();


            System.out.println("Buscando primos...");
            for (int i = inicio; i <= fin; i++) {
                int cont=0;
                for(int j = i;j >= 1;j--){
                    if(i % j == 0){
                        cont++;
                    }
                }

                if((cont==2)) {
                    System.out.println(i);
                    contador++;
                }

            }
        }
        System.out.println("Se han encontrado "+contador+" números primos en el intervalo");

        sc.close();
    }


}
