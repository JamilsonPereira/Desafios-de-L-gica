package MatrizTransposta.desafios;

public class Anagrama {
    public static void main(String[] args) {
        String s1 = "roma";
        String s2 = "ramos";

        if (isAnagrama(s1, s2))
            System.out.println("É anagrama");
        else
            System.out.println("Não é anagrama");
    }

    private static boolean isAnagrama(String s1, String s2) {

        int r = 0;
        for (int i = 0; i < s1.length(); i++)
            r = r ^ s1.charAt(i);

        for (int i = 0; i < s2.length(); i++)
            r = r ^ s2.charAt(i);

        return (r == 0);
    }
}
