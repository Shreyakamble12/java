import java.util.*;
class PatternHome
{
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =  sc.nextInt();
        int row = 1;
        int space = n-1;
         int star =1;
        while(row<=2*n-1)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print(" "+" ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("*"+" ");
                j++;
            }
            if(row<n)
            {
                star++;
            }
            else{
                star--;
            }
            row++;
            star++;
            space--;
            System.out.println();
        }

    }
}
