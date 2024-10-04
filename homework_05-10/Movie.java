import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны
    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Movie otherMovie = (Movie) obj;
        return Objects.equals(title, otherMovie.title) &&
                Objects.equals(releaseYear, otherMovie.releaseYear);
    }
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }
}