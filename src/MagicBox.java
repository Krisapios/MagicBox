import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    int filled = 0;

    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled += 1;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Заполните " + (items.length - filled) + " ячеек.");
            }
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                int randomInt = random.nextInt(items.length);
                System.out.println("Случайный предмет:  " + items[randomInt]);
                System.out.println();
                return items[randomInt];
            }
        }
        return null;
    }
}
