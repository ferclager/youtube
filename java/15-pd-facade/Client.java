public class Client {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();
        HomeCinemaFacade homeCinema = new HomeCinemaFacade(
                dvdPlayer, projector, soundSystem, screen);

        homeCinema.watchMovie(
                "El Gran Dictador", 5);

        homeCinema.endMovie();
    }
}
