public class Person {
    private String name;
    private String lastname;
    private int age;

    public Person(String imie, String nazwisko, int wiek) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Person otherPerson = (Person) o;

        if ((this.name == null && otherPerson.name!= null) ||
                (this.name!= null && !this.name.equals(otherPerson.name))) {
            return false;
        }

        if ((this.lastname == null && otherPerson.lastname != null) ||
                (this.lastname != null && !this.lastname.equals(otherPerson.lastname))) {
            return false;
        }

        return this.age == otherPerson.age;
    }
}
