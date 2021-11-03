package List;

public class Main {

    public static void main(String[] args) {

        IntList IntList = new IntArrayList();

        for (int i = 0; i < 10000; i++) {
            IntList.add(i);
        }
        IntList.add(2, 2);
        IntList.clear();
        IntList.get(5);
        IntList.isEmpty();
        IntList.remove(1);
        IntList.removeByValue(4);
        IntList.set(2, 5);
        IntList.size();
        IntList.subList(3, 47);
        IntList.toArray();

    }
}
