public class Client {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play("mp4", "El Gran Dictador");
        videoPlayer.play("avi", "The Matrix");
        videoPlayer.play("vlc", "The Matrix 2");
        videoPlayer.play("mov", "The Matrix 3");
    }
}
