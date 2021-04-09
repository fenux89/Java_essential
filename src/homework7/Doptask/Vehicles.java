package homework7.Doptask;

public enum Vehicles {
    Car1(1000, "RED") {
        @Override
        public String toString() {
            return this.name() + ": price = " + price + "; color = " + "\u001B[31m" + this.getColor() + "\u001B[0m";
        }
    }, Car2(2000, "Blue"), Car3(3000, "Black");
    public int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + ": price = " + price + "; color = " + this.getColor();
    }
}
