public class Poupanca extends Conta{
    Poupanca(String num, Pessoa titular, Data c) {
        super(num, titular, c);
    }

    void extrato(){
        System.out.println("EXTRATO DA SUA CONTA POUPANÇA: ");
        super.extrato();
    }

    void rendimentos(double juros){
        this.saldo = this.saldo + (juros*this.saldo)/100;
    }
}
