package exercicios;
import java.util.Scanner;

public class ContaCorrente {
    final int numeroConta = 123456789;
    final String numeroAgencia = "0000000.1";
    final String nomeCliente = "Caua Gilberto Paiva";
    final String dataNascimento = "18/06/2002";
    double saldoConta = 160560.67;

    public void sacarValor(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quanto voce decide sacar de sua conta?");
        double valorSacado = leitor.nextDouble();
        double subtrair = saldoConta - valorSacado;
        System.out.println("Valor " + valorSacado + " sacado com sucesso.");
        System.out.println("Você ainda possui " + subtrair + " na sua conta");
    }
    public void transferencia(){
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Insira o número da conta e a agência da conta que você deseja efetuar a transferência (divididos por uma /): ");
        String contaDestino = leitor2.next();
        Scanner letior3 = new Scanner(System.in);
        System.out.println("Insira o valor que você deseja transferir para a conta selecionada: ");
        double valorTransferido = letior3.nextDouble();
        double subtrair = saldoConta - valorTransferido;
        System.out.println(nomeCliente + ", a transferência no valor de R$" +valorTransferido+ ", para a conta " +contaDestino+ ", foi efetuada com sucesso!\nVocê agora tem R$" +subtrair+ " na sua conta.");

    }
    public void cancelamento(){
        Scanner leitor4 = new Scanner(System.in);
        System.out.println("Confirme o seu número de conta:");
        int numbConta = leitor4.nextInt();
        if (numbConta == numeroConta)
            System.out.println("Confirme o seu número da sua agência:");
            String numbAgencia = leitor4.next();
            if (numbAgencia == numeroAgencia)
                System.out.println("Dê uma justificativa para o cancelamento da sua conta:");
                String justificativa = leitor4.next();
        System.out.println("Conta cancela com sucesso, obrigado pela estadia conosco, " +nomeCliente);
    }
}
