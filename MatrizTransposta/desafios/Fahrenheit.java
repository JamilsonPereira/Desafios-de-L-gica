package MatrizTransposta.desafios;

import java.util.Scanner;

public class Fahrenheit {

    static double conversaoCelsiusFahrenheint(double C){
        return 9 * C / 5 + 32;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Digite o valor de C: ");
         double celsius = sc.nextDouble();
         System.out.println("O valor convertido é : " + conversaoCelsiusFahrenheint(celsius));
    }
}
