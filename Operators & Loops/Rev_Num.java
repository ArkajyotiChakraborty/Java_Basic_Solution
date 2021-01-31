/*Questions: Reverse of a number
Send Feedback
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891 */
public class Rev_Num {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        
        while(temp>0)
        {
            int last =temp%10;
            rev=rev*10+last;
            temp=temp/10;
           
            
            
        }
        System.out.print(rev);
        

	}
}
