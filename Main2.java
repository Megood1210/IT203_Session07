public class Main2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Bai2 s1 = new Bai2(1, "Nguyễn Văn A");
        Bai2 s2 = s1;   // gán tham chiếu

        s2.setName("Trần Thị B"); // thay đổi qua s2

        System.out.println("Thông tin s1:");
        s1.displayInfo();

        System.out.println("Thông tin s2:");
        s2.displayInfo();
    }
}