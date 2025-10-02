import java.util.Scanner;

public class funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected Data dtNasc;
    protected Data dtContr;

    public funcionario(){
        Scanner s = new Scanner(System.in);

        System.out.print("Insira aqui o nome do funcionário: ");
        this.nome = s.nextLine();

        System.out.print("Insira aqui o cpf do funcionário: ");
        this.cpf = s.next();

        System.out.print("Insira aqui o salario do funcionário: ");
        this.salario = s.nextDouble();

        System.out.print("Insira aqui a data de nascimento do funcionário: ");
        this.dtNasc = new Data();

        System.out.print("Insira aqui a data de contratação do funcionário: ");
        this.dtContr = new Data();
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public double getSalario(){
        return this.salario;
    }

    public Data getDtNasc(){
        return this.dtNasc;
    }

    public Data getDtContr(){
        return this.dtContr;
    }

    void listarDados(){
        System.out.println("*** DADOS DO FUNCIONÁRIO ***");
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Data de nascimento: " + this.dtNasc.imprime());
        System.out.println("Data de contratação: " + this.dtContr.imprime());
    }
}
