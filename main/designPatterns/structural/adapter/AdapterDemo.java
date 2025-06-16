package main.designPatterns.structural.adapter;

public class AdapterDemo {

    // this eg, we have an existing media player that plays mp3 format.
//    We have a new requirement to support mp4 and vlc formats.

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4");
        audioPlayer.play("mp3");
    }
}
