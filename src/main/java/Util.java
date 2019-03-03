/**
 * Created by alexfyang on 3/3/19.
 */
public class Util {
    public static boolean validateInput(String[] args) {
        if (args.length != 3) {
            return false;
        }
        try {
            Double arg1 = Double.valueOf(args[0]);
            Integer arg2 = Integer.valueOf(args[1]);
            Integer arg3 = Integer.valueOf(args[2]);

            if (arg1.isNaN()) {
                return false;
            }
            if (arg2 < arg3) {
                return false;
            }
            if (arg1 < 0 || arg2 < 0 || arg3 < 0) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
