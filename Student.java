package module6;

public class Student {

    private int markEconomics;
    private int markMath;
    private int markStatistics;
    private String name;

    public Student(int markEconomics, int markMath, int markStatistics, String name) {
        this.markEconomics = markEconomics;
        this.markMath = markMath;
        this.markStatistics = markStatistics;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return markEconomics + markMath +markStatistics;
    }
}