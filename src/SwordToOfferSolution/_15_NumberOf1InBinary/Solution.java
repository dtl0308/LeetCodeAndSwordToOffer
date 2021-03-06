package SwordToOfferSolution._15_NumberOf1InBinary;

/*
 * 二进制中 1 的个数
 *
 * 题目描述：
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。
 * 例如把 9 表示成二进制是 1001，有两位是 1。因此如果输入 9，该函数输出 2。
 *
 * 思路：
 * 1. 一个数 n 与一个比它小 1 位的数 n-1 进行与运算，得到的结果会消除 n 中最低位上的那个 1；
 * 2. 由于每次都会消除 1 个 1，所以等到 n 为 0 的时候，消除的次数就是 n 中 1 的个数。
 */
public class Solution {
    private static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = numberOf1(7);
        System.out.println(i);
    }
}
