//Faça um programa que mostre a tabuada a partir da escolha do usuário - usando while
import java.util.Scanner;
public class exercicio02While {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n----------------------------\n        TABUADA         \n----------------------------\n");
        System.out.println("Qual tabuada quer visualizar? ");
        int num = leitor.nextInt();
        int i = 0;
        while(i <= 10){
            int resultado = num * i;
            System.out.println(num+" x "+i+" = "+resultado);
            i++;
        }
    }
}