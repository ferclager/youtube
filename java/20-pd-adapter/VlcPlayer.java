public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file " + fileName);
    }

    @Override
    public void playAvi(String fileName) {
        // Do nothing
    }
}
