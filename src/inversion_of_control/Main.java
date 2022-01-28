package inversion_of_control;

/**
 * created by cvenkman on 1/28/22 inside the package - inversion_of_control
 */
public class Main {
    public static void main(String[] args) {
        MusicPlayer person = new MusicPlayer();
        person.playMusic();
        person.playMusic(new ClassicMusic());
        person.playMusic(new RockMusic());
        person.playMusic();
    }
}
