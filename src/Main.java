//-----------TP3 : Scanner et ASCII Art------------
//Auteur : Pancari-Fauret Giulietta
//Date : 14 octobre 2022

import java.util.Scanner;
import java.util.Objects;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int height, width;
        ASCIArt chat = new ASCIArt();
        SafeScanner scan = new SafeScanner();

        int[] output = scan.getDimDepuisFichier();
        height = output[0];
        width = output[1];

        if(height >= 3 && width >= 7) {
            chat.dessinChat(height,width);
        }
        else {
            System.out.println("Les dimensions min pour la tête du chat sont de 3 par 7 !");
            System.exit(0);
        }
        scan.fermerScanner();
    }

}
