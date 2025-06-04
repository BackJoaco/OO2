package com.patterns;

public class VideoStreamAdapter implements Media{
    private VideoStream videoStream;

    public VideoStreamAdapter(VideoStream videoStream) {
        this.videoStream = videoStream;
    }
    public String play() {
        return videoStream.reproduce();
    }
}
