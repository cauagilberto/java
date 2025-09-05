import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.print("Digite a data de hoje: ");
        Data hoje = new Data();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        Conta c1 = new ContaCorrente("1234-5", p1, hoje);
        Conta c2 = new ContaCorrente("6789-0", p2, hoje);


        c1.sacar(150);
        c1.sacar(100);
        c1.depositar(100);

    }
}