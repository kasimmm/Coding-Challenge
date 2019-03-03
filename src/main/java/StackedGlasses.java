/**
 * Created by alexfyang on 3/3/19.
 */
public class StackedGlasses {

    public static void main(String[] args) {
        StackedGlasses sg = new StackedGlasses();
        if(!Util.validateInput(args)) {
            System.out.println("Invalid inputs.");
        } else {
            Double inputByGlass = Double.valueOf(args[0]) * 4;
            Double flowIn = sg.getFlowIn(inputByGlass, Integer.valueOf(args[1]), Integer.valueOf(args[2]));
            System.out.println("Result is " + sg.outputResult(flowIn) + " litre");
        }
    }

    /**
     *
     * @param total - amount water measured by glasses (K/4)
     * @param i - i-th row
     * @param j - j-th glasses
     * @return total amount of water flown in the (i,j) glass
     *
     * Using recursion to solve the problem
     */
    public Double getFlowIn(double total, int i, int j ) {
        if (i == 0) {
            return total;
        }

        // left edge
        if (j == 0) {
            // total flow-in of the upper level minus 1 (upper one should be full)
            double totalFlowIn = getFlowIn(total, i-1 , j) - 1.0;
            return getResult(totalFlowIn);
        } else if (i == j) {
            double totalFlowIn = getFlowIn(total,i-1, j-1) - 1.0;
            return getResult(totalFlowIn);
        } else {
            double upperLeft = getFlowIn(total, i-1, j-1) - 1.0;
            double upperRight = getFlowIn(total,i-1, j) - 1.0;
            return getResult(upperLeft) + getResult(upperRight);
        }
    }

    public double outputResult(Double flowIn) {
        double measuredByGlass = flowIn >= 1.0 ? 1.0 : (flowIn < 0 ? 0.0 : flowIn);
        return measuredByGlass * 0.25;
    }

    private double getResult(double totalFlowIn) {
        // if total flow-in < 0 then this level is empty;
        return 0.5 * (totalFlowIn < 0 ? 0 : totalFlowIn);
    }


}
