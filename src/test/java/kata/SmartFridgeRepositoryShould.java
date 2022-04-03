package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartFridgeRepositoryShould {

    @Test
    void return_list_of_items_in_the_fridge() {
        SmartFridgeRepository smartFridgeRepository = new SmartFridgeRepository();
        var items = smartFridgeRepository.getItems();

        assertEquals(items.size(), 0);
    }

}
