package bubblesort;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class BubbleSort {

    private static void bubbleSort(int vetor[], int tamanho) {

        boolean troca = true;

        int aux;

        while (troca) {
            troca = false;
            for (int i = 0; i < tamanho - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

    public static void mostra_vetor(int[] vetor, int tamanho) {

        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

    }

    public static void main(String[] args) throws IOException {

        //O nome da pasta onde estão os arquivos:
        String folderBaseName = "C:\\Users\\Taffarel\\Documents\\NetBeansProjects\\BubbleSort\\src\\bubblesort\\";

        String nome_arquivo = folderBaseName + "arquivo_decrescente.txt";

        Scanner scanner = new Scanner(new FileReader(nome_arquivo));

        int[] vetor = Converter.converter(scanner.nextLine().split(" "));

        int tamanho = 1000000;

        System.out.println("Antes");

        //mostra_vetor(vetor, tamanho);
        long tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor, tamanho);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("\nDepois");

        //mostra_vetor(vetor, tamanho);
        System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");

    }

}
