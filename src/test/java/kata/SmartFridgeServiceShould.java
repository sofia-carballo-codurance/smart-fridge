package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

public class SmartFridgeServiceShould {

  SmartFridgeRepository smartFridgeRepository;
  ItemDegrader itemDegrader;
  private SmartFridgeService smartFridgeService;

   @BeforeEach
    void setUp() {
       smartFridgeRepository = mock(SmartFridgeRepository.class);
       itemDegrader = mock(ItemDegrader.class);
       smartFridgeService = new SmartFridgeService();
   }

  @Test
  void call_item_degrader_when_door_is_opened() {
    List<Item> items = new ArrayList<>();

    when(smartFridgeRepository.getItems()).thenReturn(items);
    smartFridgeService.openDoor();

    verify(itemDegrader).degrade(items);
  }
}
