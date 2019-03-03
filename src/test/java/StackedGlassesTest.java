import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexfyang on 3/3/19.
 */
public class StackedGlassesTest {

    public final StackedGlasses sg = new StackedGlasses();

    @Test
    public final void validateInput() {
        // less than 3 args
        String[] invalid0 = {"1", "1"};
        Assert.assertFalse(sg.validateInput(invalid0));

        // NaN in first args
        String[] invalid1 = {"abc", "1", "2"};
        Assert.assertFalse(sg.validateInput(invalid1));

        // Non-Int in 2nd
        String[] invalid2 = {"2.0", "1.1", "2"};
        Assert.assertFalse(sg.validateInput(invalid2));

        // Non-Int in 3rd
        String[] invalid3 = {"2.0", "1", "3.1"};
        Assert.assertFalse(sg.validateInput(invalid3));

        // (i, j) where i < j
        String[] invalid4 = {"2.0", "2", "3"};
        Assert.assertFalse(sg.validateInput(invalid4));

    }

    @Test
    public final void firstGlass () {

        Assert.assertEquals(new Double(0.1), sg.getFlowIn(0.1, 1, 1));

        Assert.assertEquals(new Double(1.1), sg.getFlowIn(1.1, 1, 1));
    }


}
