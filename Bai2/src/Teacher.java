public class Teacher extends Person{
    private String position;
    public String majors;

    public Teacher() {
    }

    public Teacher(String id, String lastName, String firstName, int age, int gender, String address, String position, String majors) {
        super(id, lastName, firstName, age, gender, address);
        this.position = position;
        this.majors = majors;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "position=" + position  +
                ", majors=" + majors  +
                '}';
    }
}
