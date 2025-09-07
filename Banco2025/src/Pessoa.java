import java.util.Scanner;

public class Pessoa {
    String nome;
    //int idade;
    char sexo;
    String cpf;
    Data dtNasc;

    Pessoa(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        this.nome = s.nextLine();

        System.out.print("Digite o seu CPF(com pontos e hifen): ");
        this.cpf = s.nextLine();

        System.out.print("Digite o seu sexo (F/M): ");
        this.sexo = s.next().charAt(0);

        System.out.print("Digite a sua data de nascimento: ");
        this.dtNasc = new Data();
        
        s.close();
    }

    public Pessoa(String n, char s, String c, Data dtNasc) {
        System.out.println("Nova pessoa criada no sistema.");
        this.nome = n;
        //this.idade = i;
        this.sexo = s;
        this.cpf = c;
        this.dtNasc = dtNasc;
    }

    /*public int calcularAno(Data dataHoje){
        int idade = dataHoje.getAno() = this.dtNasc.getAno();

        if(dataHoje.getMes() < this.dtNasc.getMes() || (dataHoje.getMes() == this.dtNasc.getMes() && dataHoje.getDia() < this.dtNasc.getDia())){
            idade --;
        }
        return idade;
    }*/
}
