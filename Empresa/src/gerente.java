public class gerente extends funcionario {
    private String senha;

    gerente(String nome, String cpf, double salario, Data dtNasc, Data dtContr, String senha){
        super(nome, cpf, salario, dtNasc, dtContr)
        this.senha = "12345";
    }

    public boolean validarSenha(){

    }
    public void alterarSenha(){}
    public double custoEquipe(){}
    public void listarEquipe(){}
    public void inserirFunciEquipe(funcionario f){}
    public void listarDados(){}
}
