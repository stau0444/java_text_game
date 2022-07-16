public class SuperLevel extends PlayerLevel{

    public String getLevelName() {
        return "SuperLevel";
    }

    @Override
    public void run() {
        System.out.println("뛰기 가능");
    }

    @Override
    public void jump() {
        System.out.println("점프 가능");
    }

    @Override
    public void turn() {
        System.out.println("턴 가능");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("-----super lever-----");
    }
}
