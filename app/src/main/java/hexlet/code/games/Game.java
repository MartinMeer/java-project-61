package hexlet.code.games;

public abstract class Game {

    protected String conditions;
    protected String task;

    public String getTask() {
        return task;
    }


    public String getConditions() {
        return conditions;
    }

    public String makeTask() {
        return task;
    }
    public String checkConditions() {
        return task;
    }
}
