package kata;

import java.util.ArrayList;
import java.util.List;

public class SmartFridgeRepository {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return this.items;
    }

    public void addItem(String name, String expiryDate, String status) {
        throw new UnsupportedOperationException();
    }

    public void removeItem(String name) {
        throw new UnsupportedOperationException();
    }
}
