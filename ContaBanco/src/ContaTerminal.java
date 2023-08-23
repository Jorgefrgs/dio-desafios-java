import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // To do: Conhecer e importar a classe scanner
        // To do: Exibir as mensagens para o usuário
        // To do: Obter pela classe scanner os valores digitados no terminal
        // To do: Exibir a mensagem final (conta criada)
        Scanner ct1 = new Scanner(System.in);
        System.out.println("Por favor digite o número da agência:");
        String agencia = ct1.nextLine();

        System.out.println("Por favor digite o número da conta:");
        int numero = ct1.nextInt();
        ct1.nextLine();

        System.out.println("Por favor digite seu nome:");
        String nome = ct1.nextLine();

        System.out.println("Por fim, por favor digite seu saldo:");
        double saldo = ct1.nextDouble();

        ct1.close();

        System.out.printf("Ola "+nome+", obrigado por criar uma conta em nosso banco, sua agênecia é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
         

    }
}
