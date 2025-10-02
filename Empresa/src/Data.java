import java.util.Scanner;

public class Data {
    private int dia, mes, ano;

    public Data(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        this.dia = s.nextInt();

        System.out.print("Digite o mês: ");
        this.mes = s.nextInt();

        System.out.print("Digite o ano: ");
        this.ano = s.nextInt();
    }
    public int comparaDt(Data d){
        if (this.ano > d.getAno()) return 1;
        if (this.ano < d.getAno()) return -1;
        if (this.mes < d.getMes()) return 1;
        if (this.mes < d.getMes()) return -1;
        if (this.dia < d.getDia()) return 1;
        if (this.dia < d.getDia()) return -1;
        return 0;
    }

    public String imprime() {
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
