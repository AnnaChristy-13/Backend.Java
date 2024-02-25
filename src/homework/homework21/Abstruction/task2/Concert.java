package homework21.Abstruction.task2;

public class Concert {
    public static void main(String[] args) {

        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument violin = new Violin();

        guitar.playNote();
        piano.playNote();
        violin.playNote();

    }
}
