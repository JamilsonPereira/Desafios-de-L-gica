package MatrizTransposta.desafios;

import java.util.Scanner;

public class Somatoria {

    public static void main(String[]args){
        int n;
        int soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        n = sc.nextInt();

        soma = ((1 + n ) * n)/2;
        System.out.println("O valor da soma é: " + soma);
    }

}
