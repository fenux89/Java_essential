package homework9.task2;

import java.util.Objects;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;
    int hashCode;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.hashCode = this.hashCode();
    }

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.hashCode = this.hashCode();
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " + "manufacture = " + getManufacturer() + "; price = " + getPrice() + "; serialNumber = " + getSerialNumber() + "; X = " + getResolutionX() + "; Y = " + getResolutionY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        if ((resolutionX != monitor.resolutionX) || (resolutionY != monitor.resolutionY)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            int result = 11;
            result = 11 * super.hashCode();
            result = 11 * result + (int) resolutionY;
            result = 11 * result + (int) resolutionX;
            return Objects.hash(result);
        } else return this.hashCode;
    }
}
