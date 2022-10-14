public class ASCIArt {
    private static int height, width;


    public static  void dessinChat(int height, int width) {
        //chat divisé en 3 lignes de caractères :

        //haut de la tête : ligne 1
        System.out.print("|\\");
        printBoucleChar(width-4,'-');
        System.out.println("/|");

        //milieu de la tête : ligne 2
        for(int i=1;i<height-1;i++) {
            System.out.print("|");
            if(i==height/2) {
                System.out.print(" ");
                System.out.print("0");
                printBoucleChar(width-6,'_');
                System.out.print("0");
                System.out.print(" ");
            }
            else {
                printBoucleChar(width-2,' ');
            }
            System.out.println("|");
        }
        //bas de la tête : ligne 3
        System.out.print(" \\_");
        printBoucleChar(width-6,'^');
        System.out.println("_/ ");
    }
    private static void printBoucleChar(int a, char c) {
        for(int i=0;i<a;i++) {
            System.out.print(c);
        }
    }
}
