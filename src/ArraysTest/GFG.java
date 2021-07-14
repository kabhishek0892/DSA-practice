package ArraysTest;

class GFG{

    // Function to get sum of digits
    static int getSum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    
    // Function to find the smallest
// number whose sum of digits is also N
    static void smallestNumber(int N)
    {
        int i = N+1;
        while (i>N)
        {
            // Checking if number has
            // sum of digits = N
            if (getSum(i) == getSum(N))
            {
                System.out.print(i);
                break;
            }
            i++;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 37;
        System.out.println(getSum(N));
        smallestNumber(N);
    }
}
