package lab4;

public class Number {
    private int Number;
    Number(int Num){
this.Number = Num;
    }

    public void isDivisibleBy(){
        if(this.Number%3==0 && this.Number%5==0){
            System.out.println(this.Number+" is divisible by 3 and 5");
    }else if(this.Number%3==0){
        System.out.println(this.Number+" is divisible by 3");
    }else if(this.Number%5==0){
        System.out.println(this.Number+" is divisible by 5");
    }else{
        System.out.println(this.Number+" is not divisible by 3 and 5");
    }
}
}
