package lab9;

public class Armstrong {
    private int Number;
    Armstrong(int num) {
        this.Number = num;
    }
       public void isArmstrong(){
        int temp = this.Number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == this.Number) {
            System.out.println(this.Number + " is an Armstrong number.");
        } else {
            System.out.println(this.Number + " is not an Armstrong number.");
        }
    }
       }

