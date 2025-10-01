package Management;

public class Doctor {
    private static int idCount = 1;
    private int id;
    private String name;
    private String speciality;

    public Doctor(String name , String speciality){
        this.id = idCount++;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId(){
        return id;
    }


    public String toString(){
        return "Doctor Id: " + id + ", Name : " + name + " Speciality: " + speciality;
    }
}
