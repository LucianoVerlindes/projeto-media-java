
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double nota1;
        double nota2;

        System.out.println("Qual seu nome: ");
        nome = sc.nextLine();

        System.out.println("Qual o valor da nota 1: ");
        nota1 = sc.nextDouble();

        System.out.println("Qual o valor da nota 2: ");
        nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println(nome + " Foi aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}