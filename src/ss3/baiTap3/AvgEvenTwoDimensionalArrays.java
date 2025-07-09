package ss3.baiTap3;

public class AvgEvenTwoDimensionalArrays {
    public static double CaculateAvgNumber(int[][] arr) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0){
                    total += arr[i][j];
                    count++;
                }
            }
        }
        return ((double)total)/count;
    }
    public static void main(String[] args) {
        int[][] array = {
                {2, 3, 4},
                {5, 7, 8},
                {6, 9, 10}
        };
        double result = AvgEvenTwoDimensionalArrays.CaculateAvgNumber(array);
        System.out.println("Trung binh cong cac so chan: "+ result);
    }
}

