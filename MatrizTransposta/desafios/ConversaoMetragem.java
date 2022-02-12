package MatrizTransposta.desafios;

import java.util.Scanner;

public class ConversaoMetragem {
    // Criar um programa para converter metros para kilometragem
    // Criar um programa para converter metros para milimetros

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double metro, kilometro, milimetro;
        System.out.println("Insira a quantidade de metros: ");
        metro = teclado.nextDouble();
        kilometro = metro / 1000;
        milimetro = metro * 1000;
        System.out.println("Kilometro: " + kilometro);
        System.out.println("Milimetro: " + milimetro);
    }
}
