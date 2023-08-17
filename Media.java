import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int np1; // Nota parcial 1
        int np2; // Nota parcial 2
        float mediaDasNotas; // Media das notas

        System.out.print("Entre com sua NP1: ");
        np1 = entrada.nextInt();
        System.out.print("Entre com sua NP2: ");
        np2 = entrada.nextInt();

        mediaDasNotas = (np1 + np2) / 2;

        System.out.println("Média das notas: " + mediaDasNotas);

    }
}
