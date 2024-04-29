package constructors;

public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address){  // Constructor
        this.name = name;   // when using this.name it means referring to class's property and when using name referring to method argument
        this.age = age;
        this.address = address;
    }
    public void setName(String name){  // Setter
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){ // Getter
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){   // toString is to print something
        return ("Student name is " + this.getName() +
                " , age is: " + this.getAge() +
                " , and address is: " + this.getAddress());
    }

    public static void main(String[] args){
        Student john = new Student("John", 25, "23 East, California");
        System.out.println(john.toString());
    }
}
