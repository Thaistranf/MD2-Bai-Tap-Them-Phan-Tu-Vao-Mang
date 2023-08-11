import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần thêm: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí trong mảng: ");
        int index = sc.nextInt();
        boolean checkIndex = true;

        if (index <= -1 || index > arr.length -1){
            System.out.println("Không tồn tại vị trí " + index + " trong mảng");
            checkIndex = false;
        }

        if (checkIndex){
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = x;
            for (int i = index + 1; i < arr.length + 1; i++) {
                newArr[i] = arr[i - 1];
            }
            System.out.print("Result: \t");
            for (int y : newArr) {
                System.out.print(y + "\t");
            }
        }
    }
}