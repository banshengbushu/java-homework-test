import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AdditionTest {
    Addition addtion;

    @Test
    public void should_return_correct_result() {
        addtion = new Addition();
        int result = addtion.add(2);
        assertThat(result, is(1));
    }
}