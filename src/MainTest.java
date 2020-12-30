import java.util.Scanner;

public class MainTest {
    public static final String MENU_ = "Menu ";
    public static final String THÊM_CÁN_BỘ = "1. thêm cán bộ ";
    public static final String HIỂN_THỊ_DANH_SÁCH_CÁN_BỘ = "2. hiển thị danh sách cán bộ";
    public static final String HIỂN_THỊ_CÁN_BỘ_CÓ_LƯƠNG_LỚN_HƠN_8_TRIỆU = "3. Hiển thị cán bộ có lương lớn hơn 8 triệu";
    public static final String THOÁT_CHƯƠNG_TRÌNH = "0. thoát chương trình";
    public static final String NHẬP_BIẾN_CHOICE = "Nhập biến choice";
    public static final String NHẬP_TÊN = "Nhập tên";
    public static final String NHẬP_NGÀY_SINH = "Nhập ngày sinh";
    public static final String NHẬP_QUÊ = "Nhập quê";
    public static final String NHẬP_MỨC_LƯƠNG = "Nhập mức lương";
    public static final String NHẬP_MỨC_THƯỞNG = "Nhập mức thưởng";
    public static final String NHẬP_MỨC_PHẠT = "Nhập mức phạt";
    public static final String NUN_DISPLAY = "_____________________________________";
    public static final String MỜI_BẬN_NHẬP_SỐ_NGƯỜI_CẦN_THÊM = "Mời bận nhập số người cần thêm";
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int ZERO = 0;
    static ManageOfficers manageOfficers = new ManageOfficers();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMune();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                    System.out.println(MỜI_BẬN_NHẬP_SỐ_NGƯỜI_CẦN_THÊM);
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case TWO:
                    manageOfficers.showAll();
                    break;
                case THREE:
                    testSalary();
                    break;
                case ZERO:
                    System.exit(ZERO);
                    break;
            }

        } while (choice != ZERO);
    }

    private static void showMune() {
        System.out.println(MENU_);
        System.out.println(THÊM_CÁN_BỘ);
        System.out.println(HIỂN_THỊ_DANH_SÁCH_CÁN_BỘ);
        System.out.println(HIỂN_THỊ_CÁN_BỘ_CÓ_LƯƠNG_LỚN_HƠN_8_TRIỆU);
        System.out.println(THOÁT_CHƯƠNG_TRÌNH);
        System.out.println(NHẬP_BIẾN_CHOICE);
    }

    private static void addNew() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(NHẬP_TÊN);
        String name = sc1.nextLine();
        System.out.println(NHẬP_NGÀY_SINH);
        String birthDay = sc.nextLine();
        System.out.println(NHẬP_QUÊ);
        String homeTown = sc1.nextLine();
        System.out.println(NHẬP_MỨC_LƯƠNG);
        int salary = Integer.parseInt(sc.nextLine());
        System.out.println(NHẬP_MỨC_THƯỞNG);
        int bonus = Integer.parseInt(sc1.nextLine());
        System.out.println(NHẬP_MỨC_PHẠT);
        int amerce = Integer.parseInt(sc.nextLine());
        Teacher teacher = new Teacher(name, birthDay, homeTown);
        Officers officers = new Officers(teacher, salary, bonus, amerce);
        manageOfficers.addOfficers(officers);
        System.out.println(NUN_DISPLAY);
    }

    private static void testSalary() {
        manageOfficers.showOfficersHaveTotalSalaryGreat8M();
    }
}
