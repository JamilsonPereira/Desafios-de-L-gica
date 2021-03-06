package MatrizTransposta.desafios;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[]v = {55,35,45,70};
        bolha(v);
        System.out.println(Arrays.toString(v));
    }
    private static void bolha(int[] v){
        for(int ultimo = v.length-1; ultimo > 0; ultimo--){
            for(int i = 0;  i < ultimo; i++){
                if ((v[i] > v[i+1]))
                    trocar(v, i, i+1);
            }
        }
    }
    public static void trocar(int[]v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
