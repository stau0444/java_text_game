abstract public class  PlayerLevel implements Level{
    abstract public String getLevelName();
    abstract public void run();
    abstract public void jump();
    abstract public void turn();
    abstract public void showLevelMessage();
    public void  go(){
        String levelName = getLevelName();
        if(!levelName.equals("BeginnerLevel")){
            System.out.println(levelName+"으로 levelUp 했습니다");
            System.out.println("--------------------------------");
        }
        showLevelMessage();
        run();
        jump();
        turn();

    }
}
