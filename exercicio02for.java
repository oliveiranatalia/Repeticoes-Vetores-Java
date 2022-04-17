//Faça um programa que mostre a tabuada a partir da escolha do usuário - usando estrutura de repetição for
import java.util.Scanner;
public class exercicio02for {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n----------------------------\n        TABUADA         \n----------------------------\n");
        System.out.println("Qual tabuada quer visualizar? ");
        int num = leitor.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num+" x "+i+" = "+resultado);
        }
    }
}