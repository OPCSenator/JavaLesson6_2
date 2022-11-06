import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.bonus.BonusService;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")

    void testUser(String[] text, long miles, boolean registered, long expected){
        BonusService service = new BonusService();
        long actual = service.calculate(miles, registered);
        assertEquals(expected, actual);
    }
}