/* Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, 
calcule e apresente a soma destes valores */

public class vetor1 {
    public static void main(String[] args) {
        int vetorValor[] = new int[5];
        int resultado = 0;

        vetorValor[0] = 3;
        vetorValor[1] = 90;
        vetorValor[2] = 1;
        vetorValor[3] = 8;
        vetorValor[4] = 2;


        for(int i=0; i < vetorValor.length; i++) {
            resultado = resultado + vetorValor[i];
        }
        System.out.println("O resultado é: "+resultado);
    }   
}
