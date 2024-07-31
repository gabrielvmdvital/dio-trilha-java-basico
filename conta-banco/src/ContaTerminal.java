import model.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem final

        System.out.println("Por favor, digite o seu nome!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o número Agência!");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo!");

        BigDecimal saldo = new BigDecimal(String.valueOf(sc.nextBigDecimal()));

        Conta conta = new Conta(nome, agencia, numero, saldo);

        System.out.println(conta);


    }
}
