import java.util.*;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = generate(10);
        System.out.println("Сгенерированные числа: " + list);
        task1(list);
        task2(list);
        task3(List.of("test", "test", "TEST", "Test", "Test", "Test123", "Test123", "Test123", "Test1543"));
        task4(List.of("test", "test", "TEST", "Test", "Test", "Test123", "Test123", "Test123", "Test1543"));
    }

    private static void task1(List<Integer> list) {
        System.out.println("Задача 1");
        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        System.out.println("_______");
    }

    private static void task2(List<Integer> list) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(list);
        for (Integer integer : set) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        System.out.println("_______");
    }

    private static void task3(List<String> words) {
        System.out.println("Задача 3");
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("_______");
    }

    private static void task4(List<String> words) {
        System.out.println("Задача 4");
        Map<String, Integer> map=new TreeMap<>();
        for (String word : words) {
          if(!map.containsKey(word)) {
              map.put(word, 1);
          } else {
              map.replace(word, map.get(word)+1);
            }
        }
        System.out.println(map);
        System.out.println("_______");
    }


    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }
}