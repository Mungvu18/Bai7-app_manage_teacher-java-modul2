public class Officers {
    private Teacher teacher;
    private int salary;
    private int bonus;
    private int amerce;
    private int totalSalary;

    public Officers(Teacher teacher, int salary, int bonus, int amerce) {
        this.teacher = teacher;
        this.salary = salary;
        this.bonus = bonus;
        this.amerce = amerce;
    }

    public int getTotalSalary() {
        return totalSalary = salary + bonus - amerce;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "teacher=" + teacher +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", amerce=" + amerce +
                ", totalSalary=" + getTotalSalary() + "\n"+
                '}';
    }
}
