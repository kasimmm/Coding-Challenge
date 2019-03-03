/**
 * Created by alexfyang on 3/3/19.
 */
public class StackedGlasses {

    public static void main(String[] args) {
        StackedGlasses sg = new StackedGlasses();
        if(!sg.validateInput(args)) {
            System.out.println("Invalid inputs.");
        } else {
            Double inputToGlasses = Double.valueOf(args[0]) / 4;
            Double flowIn = sg.getFlowIn(inputToGlasses, Integer.valueOf(args[1]), Integer.valueOf(args[2]));
        }
    }

    /**
     *
     * @param total - amount water measured by glasses (K/4)
     * @param i - i-th row
     * @param j - j-th glasses
     * @return total amount of water flown in the (i,j) glass
     */
    public Double getFlowIn(double total, int i, int j ) {
        if (i == 1) {
            return total;
        }
        return 0.0;
    }

    public boolean validateInput(String[] args) {
        if (args.length != 3) {
            return false;
        }
        try {
            if (Double.valueOf(args[0]).isNaN()) {
                return false;
            }
            if (Integer.valueOf(args[1]).getClass() != Integer.class) {
                return false;
            }
            if (Integer.valueOf(args[2]).getClass() != Integer.class) {
                return false;
            }
            if (Integer.valueOf(args[1]) < Integer.valueOf(args[2])) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
