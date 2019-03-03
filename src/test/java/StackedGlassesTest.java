import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexfyang on 3/3/19.
 */
public class StackedGlassesTest {

    public final StackedGlasses sg = new StackedGlasses();

    @Test
    public final void firstGlass () {
        // input less than one glass
        Assert.assertEquals(new Double(0.1), sg.getFlowIn(0.1, 0, 0));
        // input more than one glass
        Assert.assertEquals(new Double(1.1), sg.getFlowIn(1.1, 0, 0));
    }

    @Test
    public final void glassesOnLeftEdge() {
        Assert.assertEquals(new Double(0.5), sg.getFlowIn(2, 1, 0));
        Assert.assertEquals(new Double(1.0), sg.getFlowIn(3, 1, 0));
        Assert.assertEquals(new Double(1.5), sg.getFlowIn(4, 1, 0));

        Assert.assertEquals(new Double(0.25), sg.getFlowIn(4, 2, 0));
    }

    @Test
    public final void glassesOnRightEdge() {
        Assert.assertEquals(new Double(0.5), sg.getFlowIn(2, 1, 1));
        Assert.assertEquals(new Double(1.0), sg.getFlowIn(3, 1, 1));
        Assert.assertEquals(new Double(1.5), sg.getFlowIn(4, 1, 1));

        Assert.assertEquals(new Double(0.25), sg.getFlowIn(4, 2, 2));
    }

    @Test
    public final void glassesNotOnEdge() {
        Assert.assertEquals(new Double(0.5), sg.getFlowIn(4, 2, 1));
        Assert.assertEquals(new Double(0.25), sg.getFlowIn(6, 3, 1));
    }

}
