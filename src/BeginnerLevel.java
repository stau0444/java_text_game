public class BeginnerLevel extends PlayerLevel {

    public String getLevelName() {
        return "BeginnerLevel";
    }

    @Override
    public void run() {
        System.out.println("뛰기 가능");
    }

    @Override
    public void jump() {
        System.out.println("점프 불가능");
    }

    @Override
    public void turn() {
        System.out.println("턴 불가능");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("-----beginner level-----");
    }
}
