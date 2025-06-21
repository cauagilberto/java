package exercicios;
import java.util.Objects;
import java.util.Scanner;

public class bancoApp {
    public static void main (String[] args){
        ContaCorrente conta = new ContaCorrente();
        Scanner cliente = new Scanner(System.in);
        System.out.println("Qual operacao voce decide fazer?");
        String pergunta = cliente.next();
        if (Objects.equals(pergunta, "sacar"))
            conta.sacarValor();
        else if (Objects.equals(pergunta, "transferir")) {
            conta.transferencia();
        }

    }
}
