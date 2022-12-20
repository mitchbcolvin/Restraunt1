import java.util.ArrayList;
import java.util.Scanner;

public class counsler extends camper {
    private ArrayList<counsler> counsler = new ArrayList<>();
    private String groupName; 
    
   
    public String getGroupName() {
        return groupName;
    }



    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



    public counsler(String groupName){
        this.groupName = groupName;
    }
       


    public counsler(String name, int age) {
    }



    public void addcounsler(counsler p){
        counsler.add(p);
    }

    public String toString(){
        return "Name:" + super.getName()+ " "+ "Age:"+ super.getAge() + " "+ "Group Name:"+groupName;
    

    

   

    

   


    
}

 
}    

