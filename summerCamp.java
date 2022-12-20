import java.util.ArrayList;
import java.util.Scanner;
 
 
 
public class summerCamp {
    private static ArrayList<camper> camper = new ArrayList<>();
    private static ArrayList<counsler> counsler = new ArrayList<>();
    private static ArrayList<activities> activities = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
 
 
 
    public static void main(String[] args){
        int choice = 1;
        while (choice > 0){
            System.out.println("Welcome to Camp Wawanakwa");
            System.out.println();
            System.out.println("1) Resgister as a camper!");
            System.out.println("2) Register as a counsler!");
            System.out.println("3) Check out our activities! (we are not responsble for any injuries)");
            System.out.println("10) See yah next summer :)");
            System.out.println("Choice: ");
            System.out.println();
            choice = sc.nextInt();
            sc.nextLine();
 
            switch(choice){
 
                case 1:
                System.out.println("Register as a camper!");
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
               camper s = new camper(name, age);
                camper.add(s);
                break;
 
                case 2:
                System.out.println("Register as a consler!");
                System.out.println("Enter Name: ");
                String Name = sc.nextLine();
                System.out.println("Enter Age: ");
                int Age = sc.nextInt();
                sc.nextLine();
               counsler t = new counsler( Name,Age);
                camper.add(t);
                break;
 
                case 3:
                System.out.println("Whats the activity?");
                String activityName = sc.nextLine();
                System.out.println("Activity Rating"? //examples(a 1 year old is not scared- your child is a gonner)
                String r = sc.nextLine();
                activities m = new activities(activityName, activityRating, groupName );
                activities.add(m);
                System.out.println("Which Camper is partcipating");
                for (int index = 0; index < camper.size(); index++) {
                    System.out.println(index + " " + camper.get(index));
                }
                System.out.println();
                System.out.println("Choice:");
                int input = sc.nextInt();
                camper l =camper.get(input);
                sc.nextLine();
                if(l.getAge() < 18 && m.getActivityRating().equals("Your child is a gonner")){
                    System.out.println("We suggest, here at ColvinINC., that your child is 18");
               
                }
                break;
 
            }
        }
    }
   
}
