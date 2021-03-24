package homework1.task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        author.setAuthor("Aleksey");
        content.setContent("На улице тепло");
        title.setTitle("Зима");

        author.show();
        content.show();
        title.show();

    }
}
