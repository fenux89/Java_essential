package homework7.task3;

enum Animals {
    Animals(10), Dog(7), Cat(9);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ": age = " + age;
    }
}
