/*Faça um programa que receba 10 números inteiros, armazene-os e verifique quais 
numeros são pares, e exiba para o usuário apenas os números pares da lista. */

import java.util.Scanner;
public class vetor3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int [10];

        System.out.println("Verificação de números pares.");

        for(int i = 0; i < lista.length; i++){
            int indice = i + 1;
            System.out.print("Digite o "+indice+"° número: ");
            int valor = leitor.nextInt();
            lista[i] = valor;
        }
        for(int i = 0; i < lista.length; i++){
            if( lista[i] % 2 == 0){
                System.out.print("O número "+lista[i]+" é par.\n");
            }
        }
    }
}
