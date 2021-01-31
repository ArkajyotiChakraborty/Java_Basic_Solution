/*Questions:  
Sum of Even Numbers till N
Send Feedback
Given a number N, print sum of all even numbers from 1 to N.
Input Format :
Integer N
Output Format :
Required Sum 
Sample Input 1 :
 6
Sample Output 1 :
12 
*/
public class Even_Sum {
    public static void main(String[] args)
{  
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int i =1;
   int sum = 0;
   while(i<=n)
   { if(i%2==0)
   {  
      sum = sum+i;
     
     
     
     
     }
     i=i+1;
     
   }
   System.out.println(sum);
   }
    
}
