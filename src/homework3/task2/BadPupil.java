package homework3.task2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Bad study");
    }

    @Override
    void read() {
        System.out.println("Bad read");
    }

    @Override
    void write() {
        System.out.println("Bad write");
    }

    @Override
    void relax() {
        System.out.println("Bad relax");
    }
}
