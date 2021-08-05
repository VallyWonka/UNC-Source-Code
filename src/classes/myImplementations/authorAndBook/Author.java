package classes.myImplementations.authorAndBook;

public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
                "Author[name=%s, email=%s, gender=%s]",
                this.name,
                this.email,
                this.gender);
    }
}
