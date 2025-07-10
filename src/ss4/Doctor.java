package ss4;

public class Doctor {
    String name;
    int age;
    String address;
    String email;
    String phone;
    String workingPosition;

    public Doctor(int age, String name, String address, String email, String phone, String workingPosition) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.workingPosition = workingPosition;
    }

    public void showInfomation() {
        String info = """
                Name: %s
                Address: %s
                Email: %s
                Phone: %s
                WorkingPosition: %s
                """.formatted(name, address, email, phone, workingPosition);
        System.out.println(info);
    }
}

