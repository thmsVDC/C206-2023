import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x; //Número 1
        int y; // Número 2
        char op; // Operação a ser realizada na calculadora

        //Entrando com os dois números na calculadora
        System.out.print("Informe os dois números: ");
        x = entrada.nextInt();
        y = entrada.nextInt();


        System.out.println("(+) SOMA");
        System.out.println("(-) SUBTRAÇÃO");
        System.out.println("(*) MULTIPLICAÇÃO");
        System.out.println("(/) DIVISÃO");
        System.out.println("(ˆ) EXPONENCIAL");
        System.out.print("Qual operação deverá ser realizada? ");
        op = entrada.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("O resultado da soma " + x + " + " + y + " é: " + (x + y));
                break;
            case '-':
                System.out.println("O resultado da subtração " + x + " - " + y + " é: " + (x - y));
                break;
            case '*':
                System.out.println("O resultado da multiplicação " + x + " * " + y + " é: " + (x * y));
                break;
            case '/':
                System.out.println("O resultado da divisão " + x + " / " + y + " é: " + (x / y));
                break;
            case 'ˆ':
                System.out.println("O resultado da exponencial " + x + " ˆ " + y + " é: " + (Math.pow(x,y)));
                break;
            default:
                System.out.println("Operação não pode ser realizada.");
                break;
        }
    }
}
