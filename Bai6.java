import java.util.ArrayList;
import java.util.List;

class User {
    private final int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    //Ghi đè
    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}

class UserManager {
    private static List<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void displayUsers() {
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }

    public static int getUserCount() {
        return users.size();
    }
}

public class Bai6 {
    public static void main(String[] args) {
        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "999999");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Đã thêm " + UserManager.getUserCount() + " user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");

        UserManager.displayUsers();

        System.out.println(">> Kiểm tra đăng nhập:");

        System.out.println("- Login (\"dev_a\", \"123456\"): " + (UserManager.checkLogin("dev_a", "123456") ? "Thành công!" : "Thất bại!"));

        System.out.println("- Login (\"dev_b\", \"sai_pass\"): " + (UserManager.checkLogin("dev_b", "sai_pass") ? "Thành công!" : "Thất bại!"));
    }
}