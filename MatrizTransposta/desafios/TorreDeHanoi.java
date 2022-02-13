package MatrizTransposta.desafios;

public class TorreDeHanoi {
    public static void main(String[] args){
        int discos = 3 ;
        hanoi(discos, 'A','B', 'C');

    }

    private static void hanoi(int discos, char origem, char auxiliar, char destino) {
        if(discos > 0) {
            hanoi(discos - 1, origem, destino, auxiliar);
            System.out.println("Mover de " + origem + " para " + destino + "\n");
            hanoi(discos - 1, auxiliar, origem, destino);
        }
    }
}
