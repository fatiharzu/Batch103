package day32maps;

public class Students {
    public String name;
    public String email;
    public int age;
    public boolean succes;


    public Students(String name, String email, int age, boolean succes) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.succes = succes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", succes=" + succes +
                '}';
    }
}
