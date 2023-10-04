package human;

import java.util.Objects;

public class Developer extends Human {

    private String position;

    public Developer() {
    }

    public Developer(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void printHumanInfo() {
        System.out.println("This is developer with position = " + position);
    }

    public boolean isGoodDeveloper() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                '}';
    }
}
