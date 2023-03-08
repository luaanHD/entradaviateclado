import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        int idade;
        String nomeCompleto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();
        System.out.println("Sua idade é de: " + idade);

        System.out.println("Digite seu nome completo: ");
        entrada.next();
        nomeCompleto = entrada.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
    
        
        entrada.close();
    }
}
