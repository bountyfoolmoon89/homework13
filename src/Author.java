public class Author {
    private final String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Author (String authorName, String surname){
        this.name = authorName;
        this.surname = surname;
    }
}
