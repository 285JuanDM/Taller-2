package edu.unisabana.dyas.patterns;

import java.util.Scanner;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static int opc;
    public static String filename;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        AdvancedAudioPlayerAdapter advancedPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());

        System.out.println("Digite el tipo de archivo: \n 1. MP4 \n 2.VLC");
        opc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite el nombre del archivo: ");
        filename = scanner.nextLine();

        switch (opc) {
            case 1:
                advancedPlayer.play("mp4", filename);
                advancedPlayer.stop();
                break;
            case 2:
                advancedPlayer.play("vlc", filename);
                advancedPlayer.stop();
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
    }
}