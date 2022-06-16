package academy.learnprogramming.challenges;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName = lastName;
    }
    public int getAge() {
        return this.age = age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public boolean isTeen() {
        return (age >= 13 && age <= 19);
    }
    public String getFullName() {
        String validFirstName = firstName.toLowerCase();
        String validLastName = lastName.toLowerCase();
        if (validFirstName.equals("") && validLastName.equals("")) {
            return "";
        }else if (firstName.isEmpty()) {
            return lastName;
        }else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
