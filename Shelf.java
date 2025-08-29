import java.util.LinkedHashSet;
import java.util.Set;

public class Shelf {
    private Set<Item> items;

    public Shelf() {
        items = new LinkedHashSet<>(); // this retains order, vs a HashSet which wouldn't
    }

    public boolean addItem(Item item) {
        return items.add(item); // this will return false if duplicates are present
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public Set<Item> getItems() {
        return items;
    }
}
