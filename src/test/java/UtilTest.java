import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexfyang on 3/3/19.
 */
public class UtilTest {
    @Test
    public final void validateInput() {
        // less than 3 args
        String[] invalid0 = {"1", "1"};
        Assert.assertFalse(Util.validateInput(invalid0));

        // NaN in first args
        String[] invalid1 = {"abc", "1", "2"};
        Assert.assertFalse(Util.validateInput(invalid1));

        // Non-Int in 2nd
        String[] invalid2 = {"2.0", "1.1", "2"};
        Assert.assertFalse(Util.validateInput(invalid2));

        // Non-Int in 3rd
        String[] invalid3 = {"2.0", "1", "3.1"};
        Assert.assertFalse(Util.validateInput(invalid3));

        // (i, j) where i < j
        String[] invalid4 = {"2.0", "2", "3"};
        Assert.assertFalse(Util.validateInput(invalid4));

        // any input < 0
        String[] invalid5 = {"-2.0", "2", "3"};
        Assert.assertFalse(Util.validateInput(invalid5));
    }
}
