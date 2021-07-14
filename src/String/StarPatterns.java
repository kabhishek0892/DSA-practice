package String;
//increasing triangle pattern - outer loop - 1to n , inner loop - 1 to i
/*for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=i;j++)
        {
        System.out.print("* ");
        }
        System.out.println();
        } */
//decreasing triangle pattern - outer loop 1 to n , inner loop -> i to n

/*for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
 */

/* Right sided triangle Patter
 for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  "); // two spaces required as there is one space after *
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
 */

public class StarPatterns {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  "); // two spaces required as there is one space after *
            }

            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("* "); // two spaces required as there is one space after *
            }

            System.out.println();
        }
    }
}
