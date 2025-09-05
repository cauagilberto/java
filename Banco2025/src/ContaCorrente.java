public class ContaCorrente extends Conta{
    double limite;
    ContaCorrente(String num, Pessoa titular, Data c){
        super(num, titular, c);
        this.limite = 200.00;
    }
    double disponivel(){
        return this.saldo + this.limite;
    }
    boolean sacar(double valor){
        if (super.sacar(valor)){
            return true;
        }else return false;
    }
    void extrato(){
        System.out.println("EXTRATO DA SUA CONTA-CORRENTE: ");
        super.extrato();
    }
    public void chequeEspecial(double taxa){
        super.chequeEspecial(taxa);
    }
}
