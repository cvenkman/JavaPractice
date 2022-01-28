package inversion_of_control;

/**
 * created by cvenkman on 1/28/22 inside the package - inversion_of_control
 */
class ClassicMusic implements Music {
    @Override
    public void play() {
        System.out.println("Classic music");
    }
}