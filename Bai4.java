public class Bai4 {
    private static double classFund = 0;

    private String studentName;

    public Bai4(String studentName) {
        this.studentName = studentName;
    }

    public void payFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount);
        } else {
            System.out.println("Số tiền đóng không hợp lệ");
        }
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}