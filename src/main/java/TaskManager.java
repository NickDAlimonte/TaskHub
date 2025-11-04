import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> taskList = new ArrayList<String>();
    boolean wasEmpty = false;

    public void addTask(String taskName){

        taskList.add(taskName);
    }

    public ArrayList<String> getTaskList(){

        return taskList;
    }
}
