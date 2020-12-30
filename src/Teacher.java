public class Teacher {
    private String name;
    private String birthDay;
    private String homeTown;

    public Teacher(String name, String birthDay, String homeTown) {
        this.name = name;
        this.birthDay = birthDay;
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
