import java.util.Scanner;

public class Binaersuche {

    public static void main(String[] args) {

        int nums[] = {1, 3, 5, 6, 8, 11, 14, 15, 18, 20};
        int left = 0;
        int right = nums.length - 1;
    //    int mid = (left + right) / 2;
        int targetNum;
        System.out.print("Geben Sie die gesuchte Zahl ein: ");
        Scanner scanner = new Scanner(System.in);
        targetNum = scanner.nextInt();
        scanner.close();

        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == targetNum) {
                result = mid;
                break;
            } else if (nums[mid] < targetNum) {
                left = mid + 1;
            } else if (nums[mid] > targetNum){
                right = mid - 1;
            }
        }

        if (result == -1) {
            System.out.println("Das gesuchte Element wurde nicht gefunden.");
        } else {
            System.out.println("Das gesuchte Element befindet sich an Position " + result + ".");
        }
    }
}