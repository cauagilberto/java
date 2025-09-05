import java.util.Scanner;

public class Data {
    int dia, mes, ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
        Scanner d = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        this.dia = d.nextInt();

        System.out.print("Digite o mês: ");
        this.mes = d.nextInt();

        System.out.print("Digite o ano: ");
        this.ano = d.nextInt();
    }

    public void imprime() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }
}
