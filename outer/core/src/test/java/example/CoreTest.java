package example;

import org.example.Base;
import org.example.BaseTestFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CoreTest {
    @Test
    void testCore() {
        Base actual = new Base();
        BaseTestFixture fixture = new BaseTestFixture();
        assertNotNull(actual);
        assertNotNull(fixture);
    }
}
