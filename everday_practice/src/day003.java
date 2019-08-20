import org.junit.Test;

import java.util.Scanner;

/**
 * Function：判断某年是否为闰年
 * Created by Y.W. on 2017-10-21 23:51.
 * （按一回归年365天5小时48分45.5秒）
 * 　　①、普通年能被4整除且不能被100整除的为闰年。（如2004年就是闰年,1900年不是闰年）
 * 　　②、世纪年能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)
 * 　　③、对于数值很大的年份,这年如果能整除3200,并且能整除172800则是闰年。如172800年是闰年，
 * 86400年不是闰年(因为虽然能整除3200，但不能整除172800)。
 */

public class day003 {

    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("请随意输入一个年份：");
        while (sc.hasNext()) {
            String a = sc.next();
            try {
                year = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                System.out.println("输入的年份有误，请重新输入");
                continue;
            }

            if (year >= 3200 && (year % 172800 == 0)) {
                System.out.println("这是闰年");
            } else {
                if (year < 3200 && ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0))) {
                    System.out.println("这是闰年");
                } else {
                    System.out.println("这不是闰年");
                }
            }
        }

    }


}
