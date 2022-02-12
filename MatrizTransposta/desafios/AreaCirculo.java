package MatrizTransposta.desafios;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args){
        double area, raio, pi;
        Scanner sc = new Scanner(System.in);
        pi = Math.PI;
        System.out.println("Digite o valor do raio:");
        raio = sc.nextDouble();
        area = 2 * pi* raio;
        System.out.println("A area é : " + area);
    }
}
