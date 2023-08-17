import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char c; //Combustível utilizado
        int litros; //Litros de combustível vendido
        float preco;

        System.out.print("Qual combustível foi utilizado? ");
        c = entrada.next().charAt(0);

        System.out.print("Quantos litros foi vendido? ");
        litros = entrada.nextInt();

        if(c == 'A'){
            System.out.println("Combustível utilizado - Álcool");
            if(litros <= 20){
                preco = (litros * 4.9f);
                preco -= preco * 0.03f;
            }
            else{
                preco = (litros * 4.9f);
                preco -= preco * 0.05f;
            }
            System.out.println("Valor total com o desconto: R$" + preco);

        } else if (c == 'G') {
            System.out.println("Combustível utilizado - Gasolina");
            if(litros <= 20){
                preco = (litros * 4.9f);
                preco -= preco * 0.04f;
            }
            else{
                preco = (litros * 4.9f);
                preco -= preco * 0.06f;
            }
            System.out.println("Valor total com o desconto: R$" + preco);

        } else {
            System.out.println("Combustível não identificado!!");
        }

    }
}
