package MatrizTransposta.desafios;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        double salario;
        double imposto = 0;
        double diferenca;

        System.out.println("Digite seu salário");
            salario = sc.nextDouble();
            if(salario>4664 ){
                imposto = 923 * 0.075 + 925 * 0.15 + 913 * 0.225;
                diferenca = salario - 4664;
                imposto += diferenca * 0.275;
            }else if (salario>2826){
                imposto = 925 * 0.15;
                diferenca = salario - 2826;
                imposto = imposto + diferenca * 0.15;

            }else if(salario>3751){
                imposto = 913 * 0.225;
            }
            else if (salario>1903 && salario<2826){
                diferenca = salario - 1903;
                imposto = diferenca * 0.075;
            }
            if(imposto > 0){
                System.out.println("R$ " + imposto);
            }else{
                System.out.println("Isento");
            }

        }
}
