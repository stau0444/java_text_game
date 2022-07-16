public class Player {

    private Level  level;
    private final String userName;
    private int exp = 0;
    private int damage = 1;


    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getUserName() {
        return userName;
    }

    public  void levelUp(){
        if (exp == 3){
            AdvancedLevel advancedLevel = new AdvancedLevel();
            advancedLevel.go();
            damage = 2;
            setLevel(advancedLevel);
        }else if (exp == 6){
            SuperLevel superLevel = new SuperLevel();
            superLevel.go();
            damage = 4;
            setLevel(superLevel);
        }else if (exp == 9){
            damage = 6;
            MaxLevel maxLevel = new MaxLevel();
            maxLevel.go();
            setLevel(maxLevel);
        }
    }

    public int getExp() {
        return exp;
    }



    public void hit(Monster monster){
        if (monster.getHp()==0){
            exp++;
            System.out.println("몬스터를 잡아 exp가 1 증가했습니다.");
            if(exp%3 == 0){
                levelUp();
            }
        }else{
            monster.setHp(damage);
            System.out.println("몬스터 hp:" + monster.getHp());
        }
    }
    public Player( String userName) {
        BeginnerLevel beginnerLevel = new BeginnerLevel();
        this.level = beginnerLevel;
        this.userName = userName;
        beginnerLevel.go();
    }

}
