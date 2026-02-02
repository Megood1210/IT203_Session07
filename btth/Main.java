package btth;

public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Văn A");
        Student sv2 = new Student("SV002", "Trần Thị B");
        Student sv3 = new Student("SV003", "Lê Hoàng C");
        sv1.displayInfo();
        System.out.println();

        sv2.displayInfo();
        System.out.println();

        sv3.displayInfo();
        System.out.println();

        Student.showTotalStudent();
    }
}