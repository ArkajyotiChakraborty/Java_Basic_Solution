/* QQuestion:
Number Pattern 1
Send Feedback
Print the following pattern
Pattern for N = 4
1
23
345
4567
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
1
23
345
*/
public class Num_Pat_1 {
    public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i =1;
    
    while(i<=n)
    { int val = i;
        int j=1;
        while(j<=i)
        { 
          System.out.print(val);
        val = val+1;
        j = j+1;}
        System.out.println();
        i = i+1;}
    }

}
