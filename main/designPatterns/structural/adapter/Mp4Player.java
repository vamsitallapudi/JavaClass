package main.designPatterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    // legacy or 3rd party code

    @Override
    public void play() {
        System.out.println("Playing MP4");
    }
}
