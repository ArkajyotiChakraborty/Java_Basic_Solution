/*Questions: Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  * */
public class Dia_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = (n+1)/2;
        int i = 1;
        while(i<=row)
        {
            int space = 1;
            while(space<=row-i)
            {
                System.out.print(" ");
                space++;
                
            }
            int j = 1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
                
            }
            j=1;
            while(j<=i-1)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        int f = 1;
        while(f<=n-row)
        {
            int k = 1;
            while(k<=f)
            {
                System.out.print(" ");
                k++;
            }
            int h = 1;
            while(h<=n-row-f+1)
            {
                System.out.print("*");
                h++;
            }
            h = 1;
            while(h<=n-row-f)
            {
                System.out.print("*");
                h++;
            }
            System.out.println();
            f++;
        }ṇ
}
