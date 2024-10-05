import java.util.Scanner;
public class HappyNumber {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
           slow=square(slow);
           fast=square(square(fast));
        }while(slow!=fast);
        return slow == 1;
       }
       public int square(int num){
           int ans=0;
           while(num>0){
               int rem=num%10;
               ans+=rem*rem;
               num/=10;
           }
           return ans;
       }

       public static void main(String[] args) {
        HappyNumber hn=new HappyNumber();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(hn.isHappy(n)? "The number is a happy number" : "The number is not a happy number");
    }
}
