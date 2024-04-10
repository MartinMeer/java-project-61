package hexlet.code.games;

import hexlet.code.Engine;

public class EvenOdd extends Game {

    protected String conditions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    protected String task;



    public String getTask() {
        return task;
    }
    public String getConditions() {
        return conditions;
    }
    public String makeTask() {
        task = String.valueOf(Engine.randomizer(0, 99));
        return task;
    }
    public String calculate() {
        int a = Integer.parseInt(task);
        return a % 2 != 0 ? "no" : "yes";
    }
}



