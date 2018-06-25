package assignmnt;
import java.util.Scanner;


public class Palindrome {

public int reverse(int num) {
int x=0,a=0;
while(num!=0) {
x=num%10;
a=(a*10)+x;
num=num/10;
}

return a ;
}
public boolean isPalindrome(int num) {

int number=reverse(num);
if(number==num)
{
return true;
}
else
return false;


}
public  void reverseAndAdd(int num)
{
if(isPalindrome(num))
{
System.out.print("given no is pallindrome");
}
else
{
while(!isPalindrome(num))
{
int reverse_it=reverse(num);
int sum=num+reverse_it;
System.out.print(num+"+"+reverse_it+"="+sum);
num=sum;

}
}
}
public  void main(String[]args) {

Scanner sc=new Scanner(System.in);
System.out.print("Enter Number:");
int inputNumber =sc.nextInt();
reverseAndAdd(inputNumber);
}
}


