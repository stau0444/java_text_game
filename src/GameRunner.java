import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임 시작 ");
        System.out.println("플레이어 이름을 정해주 세요");

        String userName = scanner.next();

        System.out.println("게임을 시작합니다");
        Player player = new Player(userName);
        System.out.println(player.getUserName() + "님 게임을 시작합니다 레벨은 " + player.getLevel().getLevelName() + "입니다");
        System.out.println("몬스터가 나타나면 a를 눌러 잡으세요");

        System.out.println("몬스터 나타남");

        while (!player.getLevel().getLevelName().equals("MaxLevel")){
            boolean isKilled = false;
            Monster monster = new Monster();
            while (!isKilled) {
                String next = scanner.next();
                Level level = player.getLevel();
                switch (next) {
                    case "a":
                    case "A":
                        if(monster.getHp() == 0 ){
                            isKilled = true;
                        }
                        player.hit(monster);
                        break;

                    case "r":
                    case "R":
                        level.run();
                        break;
                    case "j":
                    case "J":
                        level.jump();
                        break;
                    case "t":
                    case "T":
                        level.turn();
                        break;
                    default:
                        System.out.println("miss");
                        break;
                }
            }
        }
        System.out.println("게임끝!");
    }
}
