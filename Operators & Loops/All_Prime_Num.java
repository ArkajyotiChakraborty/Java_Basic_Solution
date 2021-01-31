/*Questions: All Prime Numbers
Send Feedback
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19 */
public class All_Prime_Num {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp=1;
            
            
            for(int i =2;i<=n;i++)
            {
                for(int j=2;j<=i-1;j++)
                {
                    temp = i%j;
                    if(temp==0)
                    {
                        break;
                    }
                    
                    
                }
                if(temp!=0)
                {
                    System.out.println(i);
                }
                
                
            }
    
            
        }
}
