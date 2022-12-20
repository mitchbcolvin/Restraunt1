import java.util.ArrayList;
import java.util.Scanner;

public class counselor extends camper {
    private ArrayList<counselor> counselor = new ArrayList<>();
    private String groupName; 
    
   
    public String getGroupName() {
        return groupName;
    }



    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



    public counselor(String groupName){
        this.groupName = groupName;
    }
       


    public counselor(String name, int age) {
    }



    public void addcounselor(counsler p){
        counselor.add(p);
    }

    public String toString(){
        return "Name:" + super.getName()+ " "+ "Age:"+ super.getAge() + " "+ "Group Name:"+groupName;

    }

}
