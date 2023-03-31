package entity;

import java.util.ArrayList;
import java.util.List;

public class Unit {
    private final String name;
    private int unitNum;
    private final List<Quiz> quizList;

    public Unit(String name) {
        this.name = name;
        this.quizList = new ArrayList<>();
    }

    public void addQuiz(Quiz quiz) {
        quizList.add(quiz);
    }
    public String getName() {
        return this.name;
    }
    public int getUnitNum() {
        return this.unitNum;
    }
    public void setUnitNum(int num) {
        this.unitNum = num;
    }


    public List<Quiz> getQuizList() {
        return this.quizList;
    }

}
