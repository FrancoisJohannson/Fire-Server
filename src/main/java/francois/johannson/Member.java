package francois.johannson;

public class Member {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

}