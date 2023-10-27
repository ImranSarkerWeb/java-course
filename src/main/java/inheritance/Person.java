package inheritance;

public class Person {
    private String name;
    private int age;

//    public Person(){
//        System.out.println("In person default constructor.");
//    }
    public Person(String name){
        this.name = name;
        System.out.println("In person second constructor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
}
