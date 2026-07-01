import java.util.*;

public class Practice76 {
    public static void main(String[] args) {
        Config config = getInput();  

        int attempt = 1;
        while (true) {
            ArrayList<Integer> list = getRandomNumbers(config);
            System.out.print("(" + attempt + "차) ");
            printArray(list);

            if (searchArray(list, config.getKey())) {
                System.out.println(attempt + "차 실행에서 난수 " + config.getKey() + "이(가) 발생했으므로 프로그램을 종료합니다.");
                break;
            }
            attempt++;
        }
    }

    private static Config getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 난수의 개수를 입력하세요: ");
        int size = sc.nextInt();

        System.out.print("난수값의 범위를 설정하세요: ");
        int range = sc.nextInt();

        System.out.print("찾고 싶은 난수값을 입력하세요: ");
        int key = sc.nextInt();

        if (key < 0 || key > range) {
            throw new ImproperKeyValueException("난수값의 범위가 잘못되었습니다.");
        }

        return new Config(size, range, key);
    }

    private static ArrayList<Integer> getRandomNumbers(Config c) {
        ArrayList<Integer> full = new ArrayList<>();
        for (int i = 0; i <= c.getRange(); i++) {
            full.add(i);
        }

        Collections.shuffle(full);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < c.getSize(); i++) {
            result.add(full.get(i));
        }

        return result;
    }

    private static void printArray(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
        System.out.println();
    }

    private static boolean searchArray(ArrayList<Integer> list, Integer key) {
        return list.contains(key);
    }
}
class ImproperKeyValueException extends RuntimeException {
    public ImproperKeyValueException(String message) {
        super(message);
    }
}