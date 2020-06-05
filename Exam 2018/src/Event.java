import java.util.ArrayList;
import java.util.List;

public class Event {
    private String title;
    private String date;
    private String description;
    List<Person> persons = new ArrayList<>();
    public Event(String title) {
        this.title = title;
        this.date = "";
        this.description = "";
    }
    public Event(String title, String date) {
        this.title = title;
        this.date = date;
        this.description = "";
    }
    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public Event(Event e) {
        this.title = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addPerson(Person p) {
        for (int i = 0; i < persons.size();i++) {
            if (persons.get(i).getName().equals(p.getName())) return;
        }
        persons.add(p);
    }

    public int getAudienceCount() {
        return persons.size();
    }

    @Override
    public String toString() {
        return this.title + " is a " + this.description + " and will be held at " + this.date + ".";
    }

    @Override
    public boolean equals(Object obj)
    {

        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        Event e = (Event) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (e.title == this.title && e.date == this.date && e.description == this.description);
    }
}
