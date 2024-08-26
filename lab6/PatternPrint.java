package lab6;

public class PatternPrint {
    private int n;
    private int initialVal=7;
    PatternPrint(int n){
        this.n = n;
    }
    public void pattern(){
       for(int i=0;i<this.n;i++){
           System.out.print(this.initialVal+" ");
           if(this.initialVal%2==0){
               this.initialVal = this.initialVal/2;
           }else{
               this.initialVal = this.initialVal*3+1;
           }
       }
     
    }

}
