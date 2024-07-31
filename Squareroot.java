// Method to calculate square root without using libraries
public class Squareroot
{
  
  public static double squareRoot(double x) {
    // Base case for zero and one
    if (x == 0 || x == 1) {
        return x;
    }

    double precision = 1e-15; // A small number to define the precision of convergence

    double start = 0;
    double end = x;
    double mid;
    double ans = 0;

    // Binary search approach
    while (start <= end) {
        mid = (start + end) / 2;

        // If mid*mid is close enough to x
        if (Math.abs(mid * mid - x) < precision) {
            ans = mid;
            break;
        } else if (mid * mid < x) {
            start = mid;
        } else {
            end = mid;
        }
    }

    return ans;
}
