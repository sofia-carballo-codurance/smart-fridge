package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SmartFridgeShould {

    private ItemRepository itemRepository;
    private SmartFridge smartFridge;

    @BeforeEach
    void setUp() {
        itemRepository = mock(ItemRepository.class);
        smartFridge = new SmartFridge(itemRepository);
    }

    @Test
    void signal_alert_fridge_door_is_opened() {
        smartFridge.signalFridgeDoorOpened();

        verify(itemRepository).alertDoorOpened();
    }

    @Test
    void add_item_to_fridge() {
        smartFridge.scanAddedItem("Milk", "25/06/2022", "sealed");

        verify(itemRepository).addItem("Milk", "25/06/2022", "sealed");
    }

    @Test
    void alert_door_fridge_is_closed() {
        smartFridge.signalFridgeDoorClosed();

        verify(itemRepository).alertDoorClosed();
    }

    @Test
    void end_current_day() {
        smartFridge.simulateDayOver();

        verify(itemRepository).startDay();
    }
}
