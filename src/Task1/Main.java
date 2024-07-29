package Task1;
public class Main {
  public static void main(String[] args) {
        List<String> collors1 = new ArrayList<>();
        collors1.add("Black");
        collors1.add("Yellow");
        collors1.add("Blue");
        collors1.add("Orange");
        collors1.add("Red");
        List<String> collors2 = new ArrayList<>();
        collors2.add("Grey");
        collors2.add("Red");
        collors2.add("Pink");
        collors2.add("Blue");
        collors2.add("Purple");
        System.out.println(identyCollors(collors1, collors2));

    }

    public static List<String> identyCollors(List<String> list1, List<String> list2){
        list1.retainAll(list2);
        return list1;

    }
}
