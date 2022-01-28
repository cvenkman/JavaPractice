package inversion_of_control;

/**
 * created by cvenkman on 1/28/22 inside the package - inversion_of_control
 */
public class MusicPlayer {
    private Music music;

    // зависимость внедряется извне(IoC), т.е.
    // music не создается внутри класса MusicPlayer
    public void  playMusic(Music _music) {
        this.music = _music;
        _music.play();
    }

    public void  playMusic() {
        if (this.music == null) {
            System.out.println("i don't know any music");
            return;
        }
        else
            music.play();
    }
}
