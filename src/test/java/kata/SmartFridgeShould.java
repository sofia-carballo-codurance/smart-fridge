package kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SmartFridgeShould {

    @Test
    void signalFridgeDoorOpened() {
        ItemManager itemManager = mock(ItemManager.class);
        SmartFridge smartFridge = new SmartFridge();
        smartFridge.signalFridgeDoorOpened();

        verify(itemManager).alertDoorOpened();
    }
}
