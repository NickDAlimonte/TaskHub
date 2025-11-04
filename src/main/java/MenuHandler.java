import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Consumer;

public class MenuHandler {
    TaskManager manager = new TaskManager();

    Map<String, Consumer<String>> menuChoice = new HashMap<>();




    public void mainMenu(InputValidator navOption){



        System.out.println("\n\n Hi, welcome to my Task Hub. For a list of commands, please enter ? or Help\n");
        displayTasks();

        menuChoice.put("Add Task", taskName -> {
            manager.addTask(taskName);
            displayTasks();});


        while(true){


            String[] segments = navOption.getValidString().trim().split(" ", 3);

            String command = segments[0];
            String resource = segments[1];
            String argument = segments[2];

            //Quit the program
            if (command.equalsIgnoreCase("Quit")){
                break;
            }


            if(segments.length < 3){
                System.out.println("Usage: <Command> <Resource> <Argument>");
                continue;
            }

            menuChoice.get(command+" "+resource).accept(argument);




        }

    }

    public void displayTasks(){
        List<String> taskList = manager.getTaskList();
        System.out.println("Your current Tasks:\n\t");

        for(int i = 0; i < taskList.size(); i++){
            System.out.print((i+1)+".");
            System.out.print("\t"+taskList.get(i)+"\n");
        }
    }
}
