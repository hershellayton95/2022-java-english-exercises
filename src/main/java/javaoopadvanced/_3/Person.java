package javaoopadvanced._3;

public class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person {\n" +
                "\tname: \"" + name + "\"\n" +
                "\tage: " + age + "\n" +
                "\taddress: \"" + address + "\"\n" +
                "}";
    }
    @Override
    public int hashCode(){
        return this.name.hashCode() + this.age + this.address.hashCode();
    }
}
