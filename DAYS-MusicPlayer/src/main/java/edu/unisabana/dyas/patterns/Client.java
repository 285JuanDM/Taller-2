package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        AudioPlayer player = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());

        player.play("mp4", "audio1.mp4");
        player.stop();
        
        player.play("vlc", "audio2.vlc");
        player.stop();
    }
}