import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 난수의 개수를 입력하세요: ");
        int size = sc.nextInt();

        System.out.print("난수값의 범위를 설정하세요: ");
        int range = sc.nextInt();

        ArrayList<Integer> randomList = getRandomList(size, range);

        System.out.println("\n생성된 난수 배열은 다음과 같습니다.");
        printArray10PerLine(randomList);

        ArrayList<Integer> sortedList = new ArrayList<>(randomList);
        Collections.sort(sortedList);

        System.out.println("\n정렬된 난수 배열은 다음과 같습니다.");
        printArray10PerLine(sortedList);

        int min = sortedList.get(0);
        int max = sortedList.get(sortedList.size() - 1);
        System.out.println("\n가장 작은 값: " + min + ", 가장 큰 값: " + max);

        sc.close();
    }

    public static void printArray10PerLine(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + "\t");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static ArrayList<Integer> getRandomList(int size, int range) {
        ArrayList<Integer> fullList = new ArrayList<>();
        for (int i = 0; i <= range; i++) {
            fullList.add(i);
        }

        Collections.shuffle(fullList);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(fullList.get(i));
        }

        return result;
    }
}