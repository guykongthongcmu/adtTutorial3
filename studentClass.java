//672115045 Virawit Kongthong ADT Tutorial 3

public class studentClass {
    private String name;
    private String GPA;
    private String studentID;

    public studentClass(String studentIDf, String namef, String GPAf) {
        name = namef;
        GPA = GPAf;
        studentID = studentIDf;
    }

    public String toString() {
        return studentID + " " + name + " " + GPA;
    }

}
