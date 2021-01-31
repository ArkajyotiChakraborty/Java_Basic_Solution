/*Questions: Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7 */
public class Bin_Dec {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int pv = 1;
        
        while(n>0)
        {
            int temp = n%10;
            
            ans = ans + (pv*temp);
            pv = pv*2;
            n=n/10;
        }
        System.out.println(ans);

	}
}
