package main.designPatterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void play() {
        System.out.println("Playing VLC");
    }
}
