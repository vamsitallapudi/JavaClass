package main.designPatterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(String audioType) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3");
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType);
        } else {
            System.out.println("Invalid media type");
        }
    }
}
