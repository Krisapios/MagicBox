public class Main {
    public static void main(String[] args) {
MagicBox <Integer> box1 = new MagicBox<>(3);
box1.add(10);
box1.add(20);
box1.add(30);
box1.pick();

MagicBox <String> box2 = new MagicBox<>(3);
box2.add("торт");
box2.add("кот");
box2.add("дом");
box2.pick();
    }
}