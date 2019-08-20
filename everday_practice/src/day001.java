import java.util.Random;
import java.util.Scanner;

/**
 * 每日一练1——Java猜大小
 * 程序出一个数（1~100）不告诉你，让你猜这个数，程序会告诉你大了还是小了，让你再猜。
 */
public class day001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int result = random.nextInt(100) + 1;
        int guess = -1;
        while(guess != result){
        System.out.println("请猜一个 1~100 的数字：");
        while(sc.hasNext()){
            try {
                guess = Integer.parseInt(sc.next());
                if(guess <= 0 || guess > 100){
                    System.out.println("输入的数字不在范围内，请重新输入。");
                    continue;
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("输入的数字有误，请重新输入。");
                continue;
            }

        }
        if(guess == result){
            System.out.println("您猜对了");
            break;
        }else if (guess > result){
                System.out.println("大了");
            }else{
            System.out.println("小了");
        }


    }
}
}
