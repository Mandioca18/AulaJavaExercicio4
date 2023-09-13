import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float salarioMinimo;
        float salarioUsuario;
        float calculoSalario;

        System.out.println("Olá vamos descobrir quantos salários mínimos você ganha?\n digite o valor abaixo");
        salarioMinimo = 1320;
        salarioUsuario = scan.nextFloat();
        calculoSalario = (salarioUsuario / salarioMinimo);

        System.out.println("Parabéns o senhor ganha ");
        System.out.printf("%.1f", calculoSalario);
        System.out.println(" Salários Mínimos!! ou "+ Math.floor(calculoSalario) + " Sálarios Mínimos inteiros");



        //%.f

    }
}
