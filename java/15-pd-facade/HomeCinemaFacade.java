public class HomeCinemaFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Screen screen;

    public HomeCinemaFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }
    public void watchMovie(String movie, int soundLevel) {
        System.out.println("3 2 1 GO!");
        screen.down();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(soundLevel);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting home cinema down...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }
}
