import java.util.ArrayList;
 
public class camper {
    private ArrayList<camper> camper = new ArrayList<>();
    private String name;
    private int age;
    public String getAge;
       
 
    public camper(String name, int age){
        this.name = name;
        this.age = age;
       
    }
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
 
 
    public void addcamper(camper p){
        camper.add(p);
    }
 
    protected static void add(camper p) {
    }
    public String toString(){
        return "Name:" +name+ " "+ "Age:"+ age;
    }
 
 
    public String name() {
        return null;
    }
 
}