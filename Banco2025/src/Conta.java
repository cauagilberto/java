public class Conta {
    String num;
    Pessoa titular;
    Double saldo,limite;
    Data criacao;

    Conta (String num, Pessoa titular, Data c){
        this.num = num;
        this.titular = titular;
        this.saldo = 0.0;
        this.criacao = c;
        System.out.println("Nova conta adicionada ao sistema.");
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.num);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("CPF: " + this.titular.cpf);
        System.out.print("Data de nascimento: ");
        this.titular.dtNasc.imprime();
        System.out.println("Saldo disponível para saque: " + this.disponivel());
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Novo saldo: "+ this.saldo);
    }

    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.num + " realizado com sucesso. Novo saldo: " + this.saldo);
            return true;
        } else {
            System.out.println("ERRO: Saque na conta " + this.num + " nao foi realizado. Valor disponivel: " + this.disponivel());
            return false;
        }
    }

    boolean transferir(double valor, Conta dest) {
        if (this.sacar(valor)) {
            dest.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta " + this.num + " para a conta " + dest.num + ". Foi realizada com sucesso.");
            return true;
        } else {
            System.out.println("ERRO: Nao foi possivel transferir " + valor + " da conta " + this.num + " para a conta " + dest.num + ". Valor disponivel: " + this.disponivel());
            return false;
        }
    }

    public void chequeEspecial(double taxa) {
        /*if (this.saldo < 0) {
                  double juros = this.saldo * (taxa / 100);
                  this.saldo += juros;
              } else {
                  System.out.println("Saldo positivo. Nenhum juro aplicado.");
              }*/
        if (this.saldo < 0){
            this.saldo += (taxa*this.saldo)/100;
        }
    }
}
