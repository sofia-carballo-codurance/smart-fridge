package kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SmartFridgeShould {

    @Test
    void signal_alert_fridge_door_is_opened() {
        ItemRepository itemRepository = mock(ItemRepository.class);
        SmartFridge smartFridge = new SmartFridge(itemRepository);
        smartFridge.signalFridgeDoorOpened();

        verify(itemRepository).alertDoorOpened();
    }

    @Test
    void add_item_to_fridge() {
        ItemRepository itemRepository = mock(ItemRepository.class);
        SmartFridge smartFridge = new SmartFridge(itemRepository);
        smartFridge.scanAddedItem("Milk", "25/06/2022", "sealed");

        verify(itemRepository).addItem("Milk", "25/06/2022", "sealed");
    }

    @Test
    void alert_door_fridge_is_closed() {
        ItemRepository itemRepository = mock(ItemRepository.class);
        SmartFridge smartFridge = new SmartFridge(itemRepository);
        smartFridge.signalFridgeDoorClosed();

        verify(itemRepository).alertDoorClosed();
    }
}
