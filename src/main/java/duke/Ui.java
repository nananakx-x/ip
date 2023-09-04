package duke;

import duke.task.Task;
import duke.task.TaskList;

/**
 * This class deals with interactions with the user.
 */
public class Ui {
    /**
     * Displays a default start message when the program starts.
     */
    public void startMessage() {
        System.out.println("Hello friend :> My name is John, nice to meet you! " +
                "What do you have to do today?");
    }

    /**
     * Displays the default end message when the user exits the program.
     */
    public void endMessage() {
        System.out.println("Bye for now, hope to see you soon.");
    }

    /**
     * Displays a prompt for the user to reply.
     */
    public void promptReply() {
        System.out.print("Reply John: ");
    }

    /**
     * Displays a message when a task is added to the task list.
     *
     * @param task The task that is added.
     * @param totalTasks The total number of tasks in the list after adding.
     */
    public void showTaskAdded(Task task, int totalTasks) {
        System.out.println("Got it. I've added this task:\n  " + task +
                "\nNow you have " + totalTasks + " tasks in the list.");
    }

    /**
     * Displays a message when a task is deleted from the task list.
     *
     * @param task The task that is deleted.
     * @param totalTasks The total number of tasks in the list after deleting.
     */
    public void showTaskDeleted(Task task, int totalTasks) {
        System.out.println("Noted. I've removed this task:\n" + "  " + task
                + "\nNow you have " + totalTasks + " tasks in the list.");
    }

    /**
     * Displays a message when a task is marked as done.
     *
     * @param task The task that is marked as done.
     */
    public void showTaskMarked(Task task) {
        System.out.println("Nice! I've marked this task as done:\n" + "[X] "
                + task.getDescription());
    }

    /**
     * Displays a message when a task is unmarked.
     *
     * @param task The task that is unmarked.
     */
    public void showTaskUnmarked(Task task) {
        System.out.println("OK, I've marked this task as not done yet:\n" + "[ ] "
                + task.getDescription());
    }

    /**
     * Displays the user's task list.
     *
     * @param taskList The task list to be displayed.
     */
    public void showList(TaskList taskList) {
        System.out.println("Here are the tasks in your list:");

        for (int i = 1; i <= taskList.getSize(); i++) {
            // Adding toString() to use the overridden one in duke.task.Task, etc.
            System.out.println(i + ". " + taskList.getTask(i - 1).toString());
        }
    }

    /**
     * Displays the list of matching task from the user's task list.
     *
     * @param matchingTaskList The task list to be displayed.
     */
    public void showMatchingList(TaskList matchingTaskList) {
        System.out.println("Here are the matching tasks in your list:");

        for (int i = 1; i <= matchingTaskList.getSize(); i++) {
            // Adding toString() to use the overridden one in duke.task.Task, etc.
            System.out.println(i + ". " + matchingTaskList.getTask(i - 1).toString());
        }

    }

}
