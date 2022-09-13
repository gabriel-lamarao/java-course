package heranca.imposto;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    Scanner sc = new Scanner(System.in);
    Integer numeroFuncionarios;
    public void calculaImposto (){
        if (numeroFuncionarios > 10 ){
            this.imposto = rendaAnual * 0.14;
        } else {
            this.imposto = rendaAnual * 0.16;
        }
    }

    public void getData() {
        System.out.print("Name:");
        this.nome = sc.next();
        System.out.print("Anual income:");
        this.rendaAnual = sc.nextDouble();
        System.out.print("Number of employees: ");
        this.numeroFuncionarios = sc.nextInt();
    }

    @Override
    public String toString() {
        return nome + ": " + '\'' +
                "$ " + imposto;
    }
}
