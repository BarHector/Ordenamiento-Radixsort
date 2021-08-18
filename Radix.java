package Ordenamiento.Radixsort;

import java.util.Scanner;

public class Radix{
    public static void main(String[] args) {
        Scanner art = new Scanner(System.in);
        
        int[] radixOne = new int[11];
        int[] q0 = new int[11];
        int[] q1 = new int[11];
        int[] q2 = new int[11];
        int[] q3 = new int[11];
        String text = "";

        int i, j=1, k=1, z=1, y=1, x=1; 

        for (i = 1; i < 11; i++){
            System.out.print("Ingresa el numero de la posicion #" + i + ", debe tener maximo 4 digitos: ");
            radixOne[i] = art.nextInt();
    
            if(radixOne[i] > 3333){
                System.out.print("NUMERO INVALIDO\n");
                i--;
            }else{
                text = Integer.toString(radixOne[i]); //Convertimos el número ingresado a String
                
                //Revisando si cada digito del número está en el rango 
                if ( (Integer.parseInt(text.substring(0, 1)) > 3) || (Integer.parseInt(text.substring(1, 2)) > 3) || (Integer.parseInt(text.substring(2, 3)) > 3) || (Integer.parseInt(text.substring(3, 4)) > 3)){ 
                    //.parseInt: convierte el elemento String a entero
                    //.substring(inicio, fin-1): obtiene cierta parte de un String

                    System.out.print("NUMERO INVALIDO\n");
                    i--;
                }
            }
        }

        System.out.print("\n------- ARREGLO ORIGINAL -------\n");
        for (i = 1; i < 11; i++){
            System.out.print("|  " + radixOne[i] + "  ");
        }

    //unidades
        for (i = 1; i < 11; i++){
            text = Integer.toString(radixOne[i]); //Convertimos el número a cadena
            if (text.substring(3, 4).compareTo("0") == 0){ //Se revisa si el número en las unidades es un cero, se usó String pero se pueede cambiar a Int
                q0[j]=radixOne[i];
                j++;
            }else if (text.substring(3, 4).compareTo("1") == 0){ //Se revisa si el número en las unidades es un uno
                q1[k]=radixOne[i];
                k++;
            }else if (text.substring(3, 4).compareTo("2") == 0){ //Se revisa si el número en las unidades es un dos
                q2[z]=radixOne[i];
                z++;
            }else if (text.substring(3, 4).compareTo("3") == 0){ //Se revisa si el número en las unidades es un tres
                q3[y]=radixOne[i];
                y++;
            }       
        }

        i=1;
        for (x = 1; x < j; x++){ 
            radixOne[i] = q0[x]; 
            i++; 
        }

        for (x = 1; x < k ; x++){ 
            radixOne[i] = q1[x];
            i++;
        }

        for (x = 1; x < z ; x++){
            radixOne[i] = q2[x];
            i++;
        }

        for (x = 1; x < y ; x++){
            radixOne[i] = q3[x];
            i++;
        }
        
        System.out.print("\n\n-------- Ordenado por unidades --------\n");
        for (i = 1; i < 11; i++){ 
            System.out.print("|  " + radixOne[i] + "  ");
        }

    //decenas
        j=1; k=1; z=1; y=1; x=1;
        for (i = 1; i < 11; i++){
            text = Integer.toString(radixOne[i]);
            if (text.substring(2, 3).compareTo("0") == 0){ //Se revisa si el número en las decenas es un cero
                q0[j]=radixOne[i];
                j++;
            }else if (text.substring(2, 3).compareTo("1") == 0){ //Se revisa si el número en las decenas es un uno
                q1[k]=radixOne[i];
                k++;
            }else if (text.substring(2, 3).compareTo("2") == 0){ //Se revisa si el número en las decenas es un dos
                q2[z]=radixOne[i];
                z++;
            }else if (text.substring(2, 3).compareTo("3") == 0){ //Se revisa si el número en las decenas es un tres
                q3[y]=radixOne[i];
                y++;
            }       
        }

        i=1;
        for (x = 1; x < j; x++){ 
            radixOne[i] = q0[x]; 
            i++; 
        }

        for (x = 1; x < k ; x++){ 
            radixOne[i] = q1[x];
            i++;
        }

        for (x = 1; x < z ; x++){
            radixOne[i] = q2[x];
            i++;
        }

        for (x = 1; x < y ; x++){
            radixOne[i] = q3[x];
            i++;
        }

        System.out.print("\n\n-------- Ordenado por decenas --------\n");
        for (i = 1; i < 11; i++){ 
            System.out.print ("|  " + radixOne[i] + "  ");
        }

    //centenas
        j=1; k=1; z=1; y=1; x=1;
        for (i = 1; i < 11; i++){
            text = Integer.toString(radixOne[i]);
            if (text.substring(1, 2).compareTo("0") == 0){ //Se revisa si el número en las centenas es un cero
                q0[j]=radixOne[i];
                j++;
            }else if (text.substring(1, 2).compareTo("1") == 0){ //Se revisa si el número en las centenas es un uno
                q1[k]=radixOne[i];
                k++;
            }else if (text.substring(1, 2).compareTo("2") == 0){ //Se revisa si el número en las centenas es un dos
                q2[z]=radixOne[i];
                z++;
            }else if (text.substring(1, 2).compareTo("3") == 0){ //Se revisa si el número en las centenas es un tres
                q3[y]=radixOne[i];
                y++;
            }       
        }

        i=1;
        for (x = 1; x < j; x++){ 
            radixOne[i] = q0[x]; 
            i++; 
        }

        for (x = 1; x < k ; x++){ 
            radixOne[i] = q1[x];
            i++;
        }

        for (x = 1; x < z ; x++){
            radixOne[i] = q2[x];
            i++;
        }

        for (x = 1; x < y ; x++){
            radixOne[i] = q3[x];
            i++;
        }

        System.out.print("\n\n-------- Ordenado por centenas --------\n");
        for (i = 1; i < 11; i++){ 
            System.out.print ("|  " + radixOne[i] + "  ");
        }

        //miles
        j=1; k=1; z=1; y=1; x=1;
        for (i = 1; i < 11; i++){
            text = Integer.toString(radixOne[i]);
            if (text.substring(0, 1).compareTo("0") == 0){ //Se revisa si el número en los miles es un cero
                q0[j]=radixOne[i];
                j++;
            }else if (text.substring(0, 1).compareTo("1") == 0){ //Se revisa si el número en los miles es un uno
                q1[k]=radixOne[i];
                k++;
            }else if (text.substring(0, 1).compareTo("2") == 0){ //Se revisa si el número en los miles es un dos
                q2[z]=radixOne[i];
                z++;
            }else if (text.substring(0, 1).compareTo("3") == 0){ //Se revisa si el número en los miles es un tres
                q3[y]=radixOne[i];
                y++;
            }       
        }

        i=1;
        for (x = 1; x < j; x++){ 
            radixOne[i] = q0[x]; 
            i++; 
        }

        for (x = 1; x < k ; x++){ 
            radixOne[i] = q1[x];
            i++;
        }

        for (x = 1; x < z ; x++){
            radixOne[i] = q2[x];
            i++;
        }

        for (x = 1; x < y ; x++){
            radixOne[i] = q3[x];
            i++;
        }

        System.out.print("\n\n-------- Ordenado por miles --------\n");
        for (i = 1; i < 11; i++){ 
            System.out.print ("|  " + radixOne[i] + "  ");
        }
    }
}