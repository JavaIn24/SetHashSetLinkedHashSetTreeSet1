package Task2;public class Main {
  public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(7);
        numbers.add(12);
        numbers.add(15);
        numbers.add(18);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(48);
        for (Integer a : numbers) {
            if (a > 15 && a % 2 == 0) {
                System.out.println(a);
            } else if (a <= 15 ) {
                System.out.println(a / 2);

            }
        }
    }
}
