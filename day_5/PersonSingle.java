import java.util.Scanner;

class Person{
    private int id;
    private String name;
    private char gender;
    private String location;
    private static Person person;

    private Person(){
        System.out.println("Person Object is created");
    }

    public static Person createPerson(){
        if(person == null){
            person = new Person();
        }
        return person;
    }
    public void setPerson(int id, String name, char gender, String location) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.location = location;
    }
    
    @Override
    public String toString() {
        return "Person Details = Id:" + id + ", Name:" + name +
         ", Gender:" + gender + ", Location:" + location;
    } 
}
public class PersonSingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = Person.createPerson();
        person1.setPerson(101, "nithin", 'm', "mysuru");
        System.out.println(person1); // System.out.print(person.toString());
        
        Person person2 = Person.createPerson();
        System.out.println(person2); // System.out.print(person.toString());
        person2.setPerson(102, "aadya", 'f', "mysuru");
        System.out.println(person1); // System.out.print(person.toString());
    }
}