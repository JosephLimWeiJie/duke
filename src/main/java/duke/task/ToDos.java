package duke.task;

public class ToDos extends Task {

    public ToDos(int taskId, String taskName, boolean isDone) {
        super(taskId, taskName, isDone);
    }

    public ToDos(int taskId, String taskName) {
        super(taskId, taskName);
    }

    @Override
    public String taskWithSymbol() {
        return "[T]" 
                + ((this.isDone) ? Task.tickSymbol : Task.crossSymbol)
                + " " 
                + this.taskName;
    }

    @Override
    public ToDos makeDone() {
        return new ToDos(this.taskId, this.taskName, true);
    }

    @Override
    public String toString() {
        return this.taskId 
                + "." 
                + this.taskWithSymbol(); 			
    }

}
