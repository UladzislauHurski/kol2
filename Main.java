public class Main {
    public static void main(String[] args) throws Exception {
        Employee e=new Employee("John", "Doe", Position.FullTime);

        Zebra z=new Zebra("Ara", Sex.Female, false);
        Bear b=new Bear("Max", Sex.Male, true);

        e.assignAnimal(z);
        e.assignAnimal(b);

        e.feedAnimal(z, 20, true);
        e.feedAnimal(b, 10, false);
    }
}