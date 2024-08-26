package lab7;

public class IndividualDigit {
    private int Number;

    public IndividualDigit(int number) {
        this.Number = number;
    }

    public void toIndividualDigit() {
        int temp = this.Number;
        int count = 0;
        while (temp > 0) {
            System.out.println("  " + temp % 10);
            temp = temp / 10;
            count++;
        }
    }
}
