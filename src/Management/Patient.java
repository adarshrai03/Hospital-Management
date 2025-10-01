package Management;

public class Patient {

    private static int idCounter = 0;
    private int id;
    private String name;
    private String gender;
    private int age;


    public int getId(){
        return id;
    }

    public String toString(){
        return "Patient Id : " + id + ", Name: " + name +  ", Gender: " + gender + ", Age: " + age;
    }


    public Patient(String name , String gender , int age){
        this.id = ++idCounter;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
