package lab5;

public class Fibo {
    private int n;
    Fibo (int n){
        this.n = n;
    }
    public void fibonacci(){
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" "+b);
        int i = 2;
        while(i!=this.n)
        {
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
            i++;
        }
    }
}
