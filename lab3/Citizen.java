package lab3;

public class Citizen {
    private String Name;
    private String Nationality;
    private int Age;

    Citizen(String Name, String Nationality, int Age) {
       this.Name = Name;
         this.Nationality=Nationality;
         this.Age=Age;
    }

        public Boolean IsEligible() {
            if(this.Nationality.equalsIgnoreCase("Nepali")){
                if(this.Age>=18){
                    System.out.println(this.Name+" you are eligible to vote");
                    return true;
                }else{
                    System.out.println(this.Name+" you are not eligible to vote due to age i.e. "+ this.Age);
                    return false;
                }
                
            }else{
                System.out.println(this.Name+" you are not eligible to vote due to Nationality i.e. "+ this.Nationality);
                return false;
            }
        }
}
