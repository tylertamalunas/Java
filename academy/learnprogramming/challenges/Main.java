package academy.learnprogramming.challenges;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("Tyler");
        person.setAge(18);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Tamalunas");
        System.out.println("fullname= " + person.getFullName());
    }
}
