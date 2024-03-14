package questoes;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero a ser verificado: ");
        int numeroTeste = scanner.nextInt();

        if (VerificarNum(numeroTeste)){
            System.out.println(numeroTeste + " pertence a sequência!");
        } else {
            System.out.println(numeroTeste + " não pertence a sequência!");
        }
    }

    public static int Fibonacci(int n) {
        return (n < 2) ? n : Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static boolean VerificarNum(int num) {
        int i = 0;
        while (Fibonacci(i) <= num){
            if (Fibonacci(i) == num){
                return true;
            }
            i++;
        }
        return false;
    }
}
