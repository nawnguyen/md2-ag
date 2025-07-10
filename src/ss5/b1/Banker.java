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
        String info = """
                Name: %s
                Address: %s
                Department: %s
                """.formatted(name, phone, department);
        System.out.println(info);
    }
}



