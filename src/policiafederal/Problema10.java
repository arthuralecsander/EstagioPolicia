
/*Summation of primes

 Problem 10
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.*/

public class Problema10 {

    long sum;
    int contador = 2, numD,i;
    boolean numDExit;

    public void primos() {

        while (contador < 2000000) {
            numDExit = true;
            numD = 0; //Numero de divisores
            i = 1;
             
                while(i<=contador && numDExit){ //for para verificar a quantidade de divisores do numero
                    if (contador % i == 0) {
                    numD++; // incremento do valor de divisores
                    if (numD==3) {
                        numDExit = false;
                    }
                }
                    i++;
                }
                
            
            if (numD == 2) { //se o numero de divisor for iqual a 2, ele ira ser primo, divisivel apenas por 1 e ele mesmo.
                sum = sum + contador;
            } 
            contador++;
            if(contador%100000==0){ //um if apenas para mostrar na tela que ainda esta efetuando os calculos
                System.out.println("Calculando....");
            }
        }
        System.out.println("Valor total da soma dos primos: " +sum);
    }
    public void primos2() { //Mesma teoria do metodo de cima, apenas com um numero maior.

        while (contador < 20000) {
            numDExit = true;
            numD = 0; //Numero de divisores
            i = 1;
            while(i<=contador && numDExit){ //for para verificar a quantidade de divisores do numero
                    if (contador % i == 0) {
                    numD++; // incremento do valor de divisores
                    if (numD==3) {
                        numDExit = false;
                    }
                }
                    i++;
                }
            if (numD == 2) {
                sum = sum + contador;
            } 
            contador++;
        }
        System.out.println("Valor total da soma dos primos: " +sum);
    }

}
