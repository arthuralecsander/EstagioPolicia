
/*Summation of primes

 Problem 10
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.*/

public class Problema10 {

    int sum, contador = 2, numD;

    public void primos() {

        while (contador < 2000000) {
            numD = 0; //Numero de divisores
            for (int i = 1; i <= contador; i++) { //for para verificar a quantidade de divisores do numero
                if (contador % i == 0) {
                    numD++; // incremento do valor de divisores
                }
            }
            if (numD == 2) { //se o numero de divisor for iqual a 2, ele ira ser primo, divisivel apenas por 1 e ele mesmo.
                sum = sum + contador;
            } 
            contador++;
            if(contador%10000==0){ //um if apenas para mostrar na tela que ainda esta efetuando os calculos
                System.out.println("Calculando....");
            }
        }
        System.out.println("Valor total da soma dos primos: " +sum);
    }
    public void primos2() { //Mesma teoria do metodo de cima, apenas com um numero maior.

        while (contador < 20000) {
            numD = 0;
            for (int i = 1; i <= contador; i++) {
                if (contador % i == 0) {
                    numD++;
                }
            }
            if (numD == 2) {
                sum = sum + contador;
            } 
            contador++;
        }
        System.out.println("Valor total da soma dos primos: " +sum);
    }

}
