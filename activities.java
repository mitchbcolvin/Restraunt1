public class activities extends counsler{
private String activityName;
private String activityRating;
public activities( String activityName,  String groupName, String  activityRating){
    this.activityName = activityName;
    this.activityRating = activityRating;

    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }


 

public String getActivityRating() {
    return activityRating;
}

public void setActivityRating(String activityRating) {
    this.activityRating = activityRating;
}

public String toString(){
    return "Activity Name:" +getActivityName()+ " "+ "Activity Rating (Danger Level):"+ getActivityRating() + " "+ "Group Name:"+super.groupName;
 
}

}
public Object getActivityRating() {
    return null;
}
 
}
  
     ss  