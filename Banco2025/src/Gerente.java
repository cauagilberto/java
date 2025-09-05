import java.util.Scanner;

public class Gerente extends Pessoa{
    String senha;
    int matricula;;

    public Gerente(String n, char s, String c, Data dtNasc, String matricula, String senha) {
        super(n, s, c, dtNasc);
        this.matricula = 12345;
        this.senha = "p";
    }

    boolean ValidarSenha(String pwd){
        return pwd.equals(this.senha);
    }

    boolean ValidarMat(int mat){
        return mat == this.matricula;
    }

    boolean ValidarSenha(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String pswd = s.nextLine();

        return this.ValidarSenha(pswd);
    }

    boolean ValidarMat(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua matrícula: ");
        int mat = s.nextInt();

        return this.ValidarMat(mat);
    }


}
