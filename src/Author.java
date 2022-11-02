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
    public String toString() {
        return "Автор: " + name + " " + surname;
    }
    public boolean equals (Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        if (this == other){
            return true;
        }
        Author author1 = (Author) other;
        return true;
    }
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
