/*
        Prob 1: In a given array sort the numbers in triplets.

        Length of array: 6 * n

        Example: [4,2,3,5,1,6,0,8,7,4,1,3]

        Output: [2,3,4,1,5,6,0,7,8,1,3,4]

*/
//FIS
import java.util.ArrayList;
import java.util.Arrays;

public class Triplets {

    public static void main(String[] args) {
        int a[] = {4, 2, 3, 5, 1, 6, 0, 8, 7, 4, 1, 3};
        int arr2[] = new int[a.length];

       int i=0;
        while(i<a.length-1)
        {
            int[] x = Arrays.copyOfRange(a, i, i+3);
            Arrays.sort(x);
            System.out.println(Arrays.toString(x));
            i=i+3;
        }

    }
}


/*Prob 2: Fetch empName & EmpManagerName from a table employees consisting 3 fields(EmpId, EmpName, EmpManagerID)



EmpId
EmpName
EmpManagerId

001
abc
005

002
xyz
007

005
pqr
007

select empName , empid ,empManagerID from employees  where empManagerID  =(select empid from employees)
*/
