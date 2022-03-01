package MatrizTransposta.desafios;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args){
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        if(a < b+c && b < a + c && c < a + b ){
            if(a==b && b==c && a==c) {
                System.out.println("Triangulo Equilatero");
            }else if(a==b && b==c && a==c){
                System.out.println("Triangulo Isosceles");
            }else {
                System.out.println("Triangulo Escaleno");
            }
        }else {
            System.out.println("Não forma um triangulo");
        }

    }
}
