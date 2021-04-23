public class Student {

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music("I believe, I can fly");
        petya.song();
        petya.song();
        petya.song();

    }
}
