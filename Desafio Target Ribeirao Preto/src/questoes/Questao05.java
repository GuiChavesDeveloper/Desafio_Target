package questoes;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a String a ser invertida: ");
        String palavra = scanner.nextLine();

        System.out.print("String Invertida: ");
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i) + "");
        }
    }
}
