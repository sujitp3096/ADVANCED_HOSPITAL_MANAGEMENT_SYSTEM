import java.io.Serializable;

public class Patient implements Serializable {
    public int token;
    public String name;
    public int age;
    public String symptom;
    public String priority;
    public String doctor;

    public Patient(int token, String name, int age, String symptom,
                   String priority, String doctor) {
        this.token = token;
        this.name = name;
        this.age = age;;
        this.symptom = symptom;
        this.priority = priority;
        this.doctor = doctor;
    }

    public String toFileFormat() {
        return token + "," + name + "," + age + "," + symptom + ," + priority + "," + doctor;
    }
}


