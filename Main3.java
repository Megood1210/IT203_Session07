public class Main3 {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.print("Danh sách điểm: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        double average = Bai3.calculateAverage(scores);

        System.out.println("\n>> Kết quả xử lý:");

        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", average);

        for (double score : scores) {
            boolean pass = Bai3.checkPass(score);
            System.out.println("- Điểm " + score + ": " + (pass ? "Đạt" : "Trượt"));
        }
    }
}