import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Building[] buildings = {
                new Flat(
                        new Person[]{
                                new Person("Syimyk"),
                                new Person("Ilim"),
                                new Person("Baiysh"),
                                new Person("Bek")}),
                new CommunityHostel(
                        new Person[]{
                                new Person("Bek"),
                                new Person("Davran"),
                                new Person("Samira"),
                                new Person("Saltanat")}),
                new Hotel(
                        new Person[]{
                                new Person("Zhenish"),
                                new Person("Khafiz"),
                                new Person("Ainazik")})};

        for (Building building : buildings) {

                System.out.println(building);
                if (building instanceof Flat){ ((Flat) building).myMethod();
                building.rent();}
                if (building instanceof CommunityHostel) {((CommunityHostel) building).myMethod();
                building.utilities();}
                if (building instanceof Hotel) {((Hotel) building).myMethod();
                building.rent();}
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
     
        }
    }
