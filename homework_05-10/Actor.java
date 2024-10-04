import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;
    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(firstName, otherActor.firstName) &&
                Objects.equals(lastName, otherActor.lastName);
    }
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}