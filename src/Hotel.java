import java.util.Arrays;

public class Hotel extends Building {

    private Person[] family;


    public Hotel(Person[] family) {
        this.family = family;

    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public void myMethod() {

        for (Person person : family) {
            counter++;
        }
        System.out.println("Number of people " + counter);
    }

    @Override
    public void rent() {
        super.rent();
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}
