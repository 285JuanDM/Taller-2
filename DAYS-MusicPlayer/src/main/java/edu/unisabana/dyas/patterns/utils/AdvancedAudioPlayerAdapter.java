package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.toLowerCase().equals("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.toLowerCase().equals("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        }
    }

    @Override
    public void stop() {
        this.advancedAudioPlayer.stop();
    }
}
