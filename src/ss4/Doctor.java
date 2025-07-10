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
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("WorkingPosition: " + workingPosition);
    }
}

