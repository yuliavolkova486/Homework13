import java.util.Objects;

public class Author {
    private final String name;
    private final String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surName.equals(author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
