
/*Multiples of 3 and 5

Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.*/

public class Problema1 {
    private int sum,contador;
    public void calculos(){    
        while(contador<1000){               // Repetidor que vai varrer os numeros de 0 a 1000
            
            if((contador%3)==0){            // Checando se o valor do contador de 0 a 1000 e divisivel exato por 3.
                sum=sum+contador;           // Se for, ele faz a soma do valor do contador.
            } else if ((contador%5)==0){    // Checando se o valor do contador de 0 a 1000 e divisivel exato por 5
                sum=sum+contador;           // Se for, ele faz a soma do valor do contador.
            }
            contador++;                     //Incremento do contador para o proximo numero
        }
        System.out.println("Valor total da soma dos multiplos de 3 ou 5: "+sum); //Impressao do valor final
    }
   
}

