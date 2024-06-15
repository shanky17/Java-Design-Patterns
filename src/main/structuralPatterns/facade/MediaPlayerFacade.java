package main.structuralPatterns.facade;

public class MediaPlayerFacade {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;
    private final ImageLoader imageLoader;

    public MediaPlayerFacade() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        imageLoader = new ImageLoader();
    }

    void playMedia(String fileName, String fileType) {
        switch (fileType) {
            case "audio" -> audioPlayer.playAudio(fileName);
            case "video" -> videoPlayer.playVideo(fileName);
            case "image" -> imageLoader.loadImage(fileName);
            default -> System.out.println("Unsupported file: " + fileType);
        }
    }
}
