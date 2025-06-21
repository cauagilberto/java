/*public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá, mundo! (com uma IDE)");
    }
}
*/
public class Conta{
    Double saldo = 10.0;
    public void sacar(Double valor) {
        Double novoSaldo = saldo - valor;
    }
    public void impirmirSaldo(){
        System.out.println(saldo);
        //System.out.println(novoSaldo);
    }

}