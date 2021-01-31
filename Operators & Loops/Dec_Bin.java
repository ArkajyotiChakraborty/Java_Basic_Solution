/*Questions: Decimal to Binary
Send Feedback
Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111*/
public class Dec_Bin {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long ans = 0;
        long pv = 1;
        
        while(n>0)
        {
            long r = n%2;
            ans = ans+r*pv;
            pv=pv*10;
            
            n=n/2;            
        }
        System.out.println(ans);
	}
}
