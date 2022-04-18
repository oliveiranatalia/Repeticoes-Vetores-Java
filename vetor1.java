// Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, calcule e apresente a soma destes valores
import java.util.Scanner;
public class vetor01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetorValor[] = new int[5];
        int resultado = 0;
        for(int i = 0; i < vetorValor.length; i++) {
            System.out.print("Insira o "+(i+1)+"º número: ");
            vetorValor[i] = leitor.nextInt();
            resultado = resultado + vetorValor[i];
        }
        System.out.println("O resultado é: "+resultado);
    }
}
