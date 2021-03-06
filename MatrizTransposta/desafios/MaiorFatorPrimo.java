package MatrizTransposta.desafios;

public class MaiorFatorPrimo {
    public static void main(String[] args){
        long r = maior_fator_primo(13195l);
        System.out.println(r);
    }

    private static long maior_fator_primo(long a) {
        long r = a;
        for (int i = 2; i < Math.sqrt(a); i++){
            if(a % i == 0){
                return maior_fator_primo(a/i);
            }
        }
        return r;
    }
}
