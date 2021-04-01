package homework3.task2;

public class ClassRoom {
private Pupil[] classRoom;
private int index = 0;

//    public ClassRoom(Pupil pupil) {
//        pupil.read();
//        pupil.relax();
//        pupil.study();
//        pupil.write();
//    }
    public ClassRoom(int maxClassSize){
        this.classRoom = new Pupil[maxClassSize];
    }


    public void addPupil(Pupil pupil){
        if (index==classRoom.length){
            System.out.println("This class is full");
            return;
        }
        classRoom[index++] = pupil;
    }

    public void showPupilsActions() {
        Pupil pupil;
        for (int i = 0; i < index; i++) {
            pupil = classRoom[i];

            pupil.study();
            pupil.relax();
            pupil.write();
            pupil.read();

            System.out.println();
        }
    }
}
