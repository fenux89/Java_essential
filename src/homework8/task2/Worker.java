package homework8.task2;

public class Worker implements Comparable<Worker> {
    String fio;
    String post;
    String year;

    public Worker(String fio, String post, String year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    @Override
    public int compareTo(Worker emp) {
        return (this.fio.compareTo(emp.fio));
    }

    @Override
    public String toString() {
        return "ФИО = " + this.fio + " Должность = " + this.post + " Год = " + this.year;
    }
}
