package io.koschicken.java;

/**
 * 大致意思就是给了一个由质数拼成的字符串，然后给一个0-10000的数字i，返回字符串中第i到i+4的子串。
 * 问题的关键就是要能看出来题目里给的那个字符串是由质数拼成的，看出这个之后就可以像下面代码一样讨巧了，毕竟题目说参数最大只有10000.
 * 这个解法肯定不是完全符合题目的本意的，不过也通过了所有测试。
 */
public class ReID {
    public static void main(String[] args) {
        for (int i = 0; i < 10001; i++) {
            System.out.println(solution(i));
        }
    }
    public static String solution(int i) {
        String str = primeNumberStr();
        return str.substring(i, i + 5);
    }

    private static String primeNumberStr() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i < 20232; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringBuilder.append(i);
            }
        }
        return stringBuilder.toString();
    }
}
