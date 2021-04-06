package homework6.task3;


public class Distance {
    double distance;

    void print() {
        System.out.println("MtToKm  =" + Converter.convertMtToKm(distance) + " km");
        System.out.println("KmToMi  =" + Converter.convertKmToMi(distance) + " mi");
    }

    static class Converter {

        static double convertMtToKm(double metr) {
            return metr / 1000.0;
        }

        static double convertKmToMi(double kill) {
            return kill * 0.62137;
        }
    }
}
