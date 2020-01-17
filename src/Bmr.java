/**
 *
 * @author wifi
 */

    import java.util.Scanner;
public class Bmr {
    



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int age;
         
        double weight, height, BMRwomen, BMRmen ,Sex ;
         
        System.out.println("Enter weight in Kg:");
         
        Scanner kb = new Scanner(System.in);
         
        weight = kb.nextDouble();
         
        System.out.println("Enter height in Meter :");
         
        height = kb.nextDouble();
         
        System.out.println("Enter age in years:");  
         
        age = kb.nextInt();
        
        System.out.println("Enter Your Sex  '0' for women & '1' for men");
        
        Sex = kb.nextInt();
         
        if (Sex == 0) {
             int choco = 230;
        
        BMRwomen = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
                System.out.println("BMR for woman is: " + BMRwomen );
              System.out.println(BMRwomen / choco);
         }
        else if(Sex==1){
            BMRmen = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        
              System.out.println("BMR for man is: " + BMRmen);
              int choco = 230;
               System.out.println(BMRmen / choco);  
    }
       
       // BMRwomen = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
         
        //BMRmen = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
         
         
       // System.out.println("A typical Chocolate Bar contains about 230 calories");  
         
        //System.out.println("No. of Chocolate Bars consumed to maintain your weight: ");
         
    }}
         
        
       
        
    

    
    
 
