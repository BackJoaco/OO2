package com.patterns;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public void play() {
        this.mediaList.forEach(media -> System.out.println(media.play()));
    }

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoFile());
        player.addMedia(new Audio());
        player.addMedia(new VideoStreamAdapter(new VideoStream()));
        player.play();
    }
}
