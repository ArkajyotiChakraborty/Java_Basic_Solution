/*Number Pattern 2
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
Sample Input :
5
Sample Output :
          1
        23
      345
    4567
  56789
 */

 public class Num_Pat2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		int N = scan.nextInt();
		int i=1;
		int val=1;
		while(i<=N)
		{
			int space=1;
			while(space<=N-i)
			{
			   System.out.print(" ");
			   space=space+1;
			}
			int j=1;
			while(j<=i)
			{
				System.out.print(val);
				val=val+1;
				j=j+1;
			}
			  System.out.println();
			i=i+1;
			val=i;
		}
    }
 }