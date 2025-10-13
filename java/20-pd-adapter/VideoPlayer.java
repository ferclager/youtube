public class VideoPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String videoType, String fileName) {
        if (videoType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file " + fileName);
        } else if (videoType.equalsIgnoreCase("vlc")
                || videoType.equalsIgnoreCase("avi")) {
            mediaAdapter.play(videoType, fileName);
        } else {
            System.out.println("Format " + videoType
                    + " not supported for " + fileName);
        }
    }
}
