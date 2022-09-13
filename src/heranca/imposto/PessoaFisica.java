package heranca.imposto;

import java.util.Scanner;

public class PessoaFisica extends Pessoa {

    Scanner sc = new Scanner(System.in);

    public PessoaFisica(){
    }
    Double gastosSaude;
    public void calculaImposto (){
        if(rendaAnual < 20000.00){
            this.imposto = rendaAnual * 0.15;
        } else if (rendaAnual > 20000.00) {
            this.imposto = rendaAnual * 0.25;
        }
        if (gastosSaude > 0){
            this.imposto = imposto - gastosSaude * 0.5;
        }

    }

    public void getData(){
        System.out.print("Name:");
        this.nome = sc.next();
        System.out.print("Anual income:");
        this.rendaAnual = sc.nextDouble();
        System.out.print("Health expenditures: ");
        this.gastosSaude = sc.nextDouble();
    }

    @Override
    public String toString() {
        return nome + ":" + '\'' +
                "$ " + imposto;
    }
}
