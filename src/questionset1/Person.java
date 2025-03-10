package questionset1;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void have_birthday(){
        age += 1;
    }

    public static void main(String[] args) {
        Person person =new Person("Emily", 30);
        person.have_birthday();

        System.out.println(person);
        System.out.println(person.age);
    }
}
