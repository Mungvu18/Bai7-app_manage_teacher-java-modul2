import java.util.ArrayList;

public class ManageOfficers {
    public static final String KHÔNG_CÓ_GIÁO_VIÊN_NÀO_CÓ_LƯƠNG_HƠN_8_CỦ = "Không có giáo viên nào có lương hơn 8 củ";
    ArrayList<Officers> listOfOfficers = new ArrayList<>();
    public void addOfficers(Officers officers){
        listOfOfficers.add(officers);
    }
    public void showAll(){
        System.out.println(listOfOfficers);
    }
    public void showOfficersHaveTotalSalaryGreat8M(){
        boolean testTotalSalary = false;
        for (int i = 0; i < listOfOfficers.size(); i++) {
             testTotalSalary = listOfOfficers.get(i).getTotalSalary() >= 8;
            if(testTotalSalary){
                System.out.println(listOfOfficers.get(i));
            }
        }
        if (!testTotalSalary){
            System.out.println(KHÔNG_CÓ_GIÁO_VIÊN_NÀO_CÓ_LƯƠNG_HƠN_8_CỦ);
        }
    }
}
