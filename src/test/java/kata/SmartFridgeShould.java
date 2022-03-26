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
}
