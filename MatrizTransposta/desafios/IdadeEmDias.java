package MatrizTransposta.desafios;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[]args){
        int ano, meses, dias;
        int idadeEmDias;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade em anos: ");
        ano = sc.nextInt();
        System.out.println("Digite os meses: ");
        meses = sc.nextInt();
        System.out.println("Digite os dias: ");
        dias = sc.nextInt();

        idadeEmDias = ano * 365 + meses * 30 + dias;
        System.out.println("Essa é a quantidade de dias " + idadeEmDias);
    }
}
