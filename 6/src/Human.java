public class Human extends Person{
    public String name;
    public String lastName;
    public String age;
    public String phoneNumber;

    public Human(String name, String lastName, String age, String phoneNumber){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public static String[] getArrayList(Human target) {
        return new String[]{target.name, target.lastName, target.age, target.phoneNumber};
    }
}
