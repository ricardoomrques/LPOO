import java.util.Objects;

public abstract class Person extends User implements Comparable{
    private String name;
    private int age;
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        setUsername(name + age);
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;

        return person.getName().compareTo(name);
    }

}
