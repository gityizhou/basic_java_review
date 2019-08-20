import org.junit.Test;

/**
 * 打印99乘法表
 * 难点是双层for循环，控制两层不同的变量
 */

public class day002 {

    @Test
    public void print99MultiplicationTable(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            }
            System.out.print("\n");
        }
    }
}
