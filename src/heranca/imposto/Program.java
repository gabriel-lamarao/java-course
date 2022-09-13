package heranca.imposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of taxpayers:");
        int payers = sc.nextInt();

        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < payers; i++) {
            System.out.print("Tax payer #"+ i + " data:");
            System.out.print("Individual or company (i/c)?");
            String type = sc.next();
            if (type.equals("i")){
                PessoaFisica pf = new PessoaFisica();
                pf.getData();
                pf.calculaImposto();
                pessoas.add(pf);
            } else if(type.equals("c")){
                PessoaJuridica pj = new PessoaJuridica();
                pj.getData();
                pj.calculaImposto();
                pessoas.add(pj);
            } else {
                System.out.println("Data incorrect, try again");
                i--;
            }
        }
        System.out.println("Taxes Paid:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
