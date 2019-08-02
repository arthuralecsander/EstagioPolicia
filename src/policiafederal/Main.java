import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean sair = true;
        Problema1 prob1 = new Problema1();
        Problema10 prob10 = new Problema10();
        
        while(sair==true){ //While que cuida do menu 
            int opcoes;
            System.out.println("\t\t\tMenu\n" //escrita do menu com suas possibilidades
                    + "1- Calcular a soma dos multimos de 3 ou 5 menor que 1000\n"
                    + "2- Calcular a soma dos primos menor qie o numero 2000000\n"
                    + "3- Calcular a soma dos primos menor que o numero 20000\n"
                    + "0- Sair");
            System.out.print("Opcao: ");
            opcoes = input.nextInt();
            
            switch(opcoes){ //switch com as atuacoes de cada opcao
                case 1: //caso 1 soma dos multiplos de 3 ou 5
                    prob1.calculos();
                    break;
                case 2: //caso 2 soma dos primos com o valor menor que 2000000
                    System.out.println("2000000 E um numero muito Grande, vai demorar ate o calculo terminar\n"
                            + "Deseja continuar?\n"
                            + "Y ou N");
                    String decisao = input.next();
                    if("Y".equals(decisao)||"y".equals(decisao)){
                        prob10.primos();
                    }else if("N".equals(decisao)||"n".equals(decisao)){
                        System.out.println("Voltando ao menu...");
                        break;
                    }
                    break;
                case 3: //caso 3 soma dos primos com o valor menor que 20000
                    prob10.primos2();
                    break;
                case 0: //caso 0 para trocar a boolean de true para false, para sair do while
                    sair=false;
                    break;
            }
        }    
    } 
}
