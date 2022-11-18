public abstract class Building implements Utilities,Rent{
    int counter=0;

    @Override
    public void rent() {
        System.out.println(" Pay rent ");
    }

    @Override
    public void utilities() {
        System.out.println(" Pay utilities ");
    }
}
