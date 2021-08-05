package classes.myImplementations.authorAndBook;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Charles Bukowski", "charles@bukowski.com", "male");
        Book book = new Book("Post Office", author, 59.9, 50000);
        System.out.println(author);
        System.out.println(book);
    }
}
