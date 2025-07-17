import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(1, "C"); // Chèn "C" vào vị trí thứ 2 (index 1)
        System.out.println("ArrayList: " + arrayList); // Output: ArrayList: [A, C, B]
        System.out.println("Phần tử ở vị trí 0: " + arrayList.get(0)); // Output: Phần tử ở vị trí 0: A
        arrayList.remove(0);
        System.out.println("ArrayList sau khi xóa: " + arrayList); // Output: ArrayList sau khi xóa: [C, B]

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add(1, "Z"); // Chèn "Z" vào vị trí thứ 2 (index 1)
        System.out.println("LinkedList: " + linkedList); // Output: LinkedList: [X, Z, Y]
        System.out.println("Phần tử ở vị trí 1: " + linkedList.get(1)); // Output: Phần tử ở vị trí 1: Z
        linkedList.remove(0);
        System.out.println("LinkedList sau khi xóa: " + linkedList); // Output: LinkedList sau khi xóa: [Z, Y]
    }
}