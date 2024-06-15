package main.structuralPatterns.facade;

public class Main {
    public static void main(String[] args) {
        MediaPlayerFacade mediaPlayerFacade = new MediaPlayerFacade();

        mediaPlayerFacade.playMedia("song.mp3", "audio");

        mediaPlayerFacade.playMedia("video.mp4", "video");

        mediaPlayerFacade.playMedia("image.jpg", "image");

        mediaPlayerFacade.playMedia("unknown.file", "unknown");
    }
}
