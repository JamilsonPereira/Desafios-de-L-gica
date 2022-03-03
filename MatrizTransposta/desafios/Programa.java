package MatrizTransposta.desafios;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args){
        int []v = {1,2,3,4,5,6,7}; //4,3,2,1,7,6,5 -> 5671234
        deslocar(v, 3);
        System.out.println(Arrays.toString(v));
    }

    private static void deslocar(int[] v, int k) {
        int n = v.length;

        inverter(v, 0, n-1-k);
        inverter(v, n-k, n-1);
        inverter(v, 0, n-1);
    }

    private static void inverter(int[] v, int i, int f) {
        while (i < f){
            trocar(v, i, f);
            i++; f--;
        }
    }

    private static void trocar(int[] v, int i, int f) {
        int aux = v[i];
        v[i] = v[f];
        v[f] = aux;
    }
}
