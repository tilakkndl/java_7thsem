package lab8;

public class Palindrome {
    private int num;
    public Palindrome(int num) {
        this.num = num;
    }
  public Boolean isPalindrome() {
        int temp = this.num;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        if (this.num == rev) {
            System.out.println(this.num + " is a palindrome number");
            return true;
        }
        System.out.println(this.num + " is not a palindrome number");
        return false;
    }
}
