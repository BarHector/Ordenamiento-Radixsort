#include <stdio.h>

int main(){
    int radixOne[11]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char text[4]={'0','0','0','0'};
    int q0[11]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int q1[11]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int q2[11]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int q3[11]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int i, j=1, k=1, z=1, y=1, x=1; 

    for (i = 1; i < 11; i++){
        printf("Ingresa el numero de la posicion #%i, debe tener maximo 4 digitos: ", i);
        scanf("%i", &radixOne[i]);

        if(radixOne[i] > 3333){
            printf("NUMERO INVALIDO\n");
            i--;
        }else{
            sprintf(text, "%i", radixOne[i]);

            if ((text[0] >= '4') || (text[1] >= '4') || (text[2] >= '4') || (text[3] >= '4')){
                printf("NUMERO INVALIDO\n");
                i--;
            }
        }
    }

    printf("\n------- ARREGLO ORIGINAL -------\n");
    for (i = 1; i < 11; i++){
        printf("|  %i  ", radixOne[i]);
    }

//unidades
    for (i = 1; i < 11; i++){
        sprintf(text, "%i", radixOne[i]);
        if (text[3] == '0'){
            q0[j]=radixOne[i];
            j++;
        }else if (text[3] == '1'){
            q1[k]=radixOne[i];
            k++;
        }else if (text[3] == '2'){
            q2[z]=radixOne[i];
            z++;
        }else if (text[3] == '3'){
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
    
    printf("\n\n-------- Ordenado por unidades --------\n");
    for (i = 1; i < 11; i++){ 
        printf("|  %i  ", radixOne[i]);
    }


//decenas
    j=1, k=1, z=1, y=1, x=1;
    for (i = 1; i < 11; i++){
        sprintf(text, "%i", radixOne[i]);
        if (text[2] == '0'){
            q0[j]=radixOne[i];
            j++;
        }else if (text[2] == '1'){
            q1[k]=radixOne[i];
            k++;
        }else if (text[2] == '2'){
            q2[z]=radixOne[i];
            z++;
        }else if (text[2] == '3'){
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
    
    printf("\n\n-------- Ordenado por decenas --------\n");
    for (i = 1; i < 11; i++){ 
        printf("|  %i  ", radixOne[i]);
    }

//centenas
    j=1, k=1, z=1, y=1, x=1;
    for (i = 1; i < 11; i++){
        sprintf(text, "%i", radixOne[i]);
        if (text[1] == '0'){
            q0[j]=radixOne[i];
            j++;

        }else if (text[1] == '1'){
            q1[k]=radixOne[i];
            k++;
        }else if (text[1] == '2'){
            q2[z]=radixOne[i];
            z++;
        }else if (text[1] == '3'){
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
    
    printf("\n\n-------- Ordenado por centenas --------\n");
    for (i = 1; i < 11; i++){ 
        printf("|  %i  ", radixOne[i]);
    }

//Miles
    j=1, k=1, z=1, y=1, x=1;
    for (i = 1; i < 11; i++){
        sprintf(text, "%i", radixOne[i]);
        if (text[0] == '0'){
            q0[j]=radixOne[i];
            j++;

        }else if (text[0] == '1'){
            q1[k]=radixOne[i];
            k++;
        }else if (text[0] == '2'){
            q2[z]=radixOne[i];
            z++;
        }else if (text[0] == '3'){
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
    
    printf("\n\n-------- Ordenado por miles --------\n");
    for (i = 1; i < 11; i++){ 
        printf("|  %i  ", radixOne[i]);
    }

    printf("\n\n------- ARREGLO ORDENADO -------\n");
    for (i = 1; i < 11; i++){
        printf("|  %i  ", radixOne[i]);
    }
}