/*Questions: Nth Fibonacci Number
Send Feedback
Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
Integer n
Output Format :
Nth Fibonacci term i.e. F(n)
Constraints:
1 <= n <= 25
Sample Input 1:
4
Sample Output 2:
3 
Sample Input 1:
6
Sample Output 2:
8 */
public class Nth_Fib {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0 ;
        int a = 0;
        int b= 1;
        
        for(int i = 1;i<=n-1;i++)
        {
            c = a+b;
            a=b;
            b=c;
            
            
        }
        System.out.println(c);
        
		
		

		
	}
}
