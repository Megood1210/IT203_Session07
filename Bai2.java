public class Bai2 {
    private int id;
    private String name;

    public Bai2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + id + ", Tên SV: " + name);
    }
}