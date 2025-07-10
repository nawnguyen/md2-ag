package ss5.b1;

public class Banker {
    // Bao đóng bằng cachs dùng private
    private String name;
    private String phone;
    private String department;
    // Tên công ty là thông tin chung của tất cả nhân viên
    public static String companyName = "Công ty cổ phần VP Bank";

    public Banker(String name, String phone, String department) {
        this.name = name;
        this.phone = phone;
        this.department = department;
    }

    // Encapsulation
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Department: " + department);
        System.out.println("Company: " + companyName);
    }
}


/*Bài 1: Luyện tập tính bao đóng và static
Khai báo 1 lớp nhân viên cho công ty thương mại ABC có các thuộc tính sau:
- Tên, số điện thoại, bộ phận làm việc, tên công ty.
Sau khi triển khai xong thì thực hiện các yêu cầu sau:
- Sử dụng comment để chú thích các dòng lệnh, khối lệnh thể hiện tính bao đóng.
- Dòng lệnh sử dụng static và giải thích tại sao phải sử dụng.*/