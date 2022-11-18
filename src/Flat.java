import java.util.Arrays;

public class Flat extends Building {

    private Person[] family;
    private int counter;


    public Flat(Person[] family) {
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
        System.out.println("Number of people "+counter);
    }

    @Override
    public void rent() {
        super.rent();
    }


    @Override
    public String toString() {
        return "Flat{" +
                "family=" + Arrays.toString(family) +
                '}' + "";
    }


}
