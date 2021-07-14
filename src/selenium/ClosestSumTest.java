package selenium;

public class ClosestSumTest {
    public static void main(String[] args) {
        int a[] ={1,3,4,7,3};
        int num =3;
        removeDuplicates(a,num);

        }
static int removeDuplicates(int[] nums ,int val)
{
    int i=0;int j= nums.length;
     while(i<j)
         {
            if(nums[i]!=val)
            {
                i++;
            }
            else if(nums[i]==val){
                nums[i]=nums[j-1];
                j--;

            }
         }
    return j;
}

    }
