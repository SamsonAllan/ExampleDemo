public class Student {
    private String name;
    private String position;

    public Student(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }
// getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
