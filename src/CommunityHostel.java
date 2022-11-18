import java.util.Arrays;

public class CommunityHostel extends Building{
    private Person[] family;


    public CommunityHostel( Person[] family) {
        this.family = family;
    }


    @Override
    public void utilities() {
        super.utilities();
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
    public String toString() {
        return "CommunityHostel{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}