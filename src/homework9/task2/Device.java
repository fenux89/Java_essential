package homework9.task2;

import java.util.Objects;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;
    int hashCode;

    public Device() {
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
        this.hashCode = this.hashCode();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacture = " + getManufacturer() + "; price = " + getPrice() + "; serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        if ((manufacturer != device.manufacturer) || (price != device.price) || (serialNumber != device.serialNumber))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            int result = 11;
            result = 11 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
            result = 11 * result + Float.floatToIntBits(price);
            result = 11 * result + (serialNumber == null ? 0 : serialNumber.hashCode());
            return Objects.hash(result);
        } else return this.hashCode;
    }
}
