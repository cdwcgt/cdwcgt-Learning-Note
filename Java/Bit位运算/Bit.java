public class Bit {
    public static void main(String[] args){
        /*
        A = 0010 1101
        B = 1001 0100

        A&B = 0000 0100 两位都为1输出1 A与B
        A|B = 1011 1101 有一位为1输出1 A或B
        A^B = 1011 1001 两位数相同输出1 A异或B
        ~A = 1101 0010 取反 1为0 0为1
        ~B = 0110 1011
        */
        // 2*8 Bit运算
        System.out.println(2<<3);
        /*
        << *2
        相当于左移一位 0000 1001 变为 0001 0010 10进制相当于 *2 即2*2=4
        >> /2
        相当于右一一位 0010 1000 变为 0001 0100 10进制相当于 /2 即2/2=1
        */
    }
}