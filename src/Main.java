/**
 * 有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的这些木棒以某个顺序首尾相连构成一个面积大于 0 的简单多边形且所有木棒都要用上，简单多边形即不会自交的多边形。
 *
 * 初始集合是空的，有两种操作，要么给集合添加一个长度为 L 的木棒，要么删去集合中已经有的某个木棒。每次操作结束后你都需要告知是否能用集合中的这些木棒构成一个简单多边形。
 *
 *
 * 输入描述:
 * 每组测试用例仅包含一组数据，每组数据第一行为一个正整数 n 表示操作的数量(1 ≤ n ≤ 50000) ， 接下来有n行，每行第一个整数为操作类型 i (i ∈ {1,2})，第二个整数为一个长度 L(1 ≤ L ≤ 1,000,000,000)。如果 i=1 代表在集合内插入一个长度为 L 的木棒，如果 i=2 代表删去在集合内的一根长度为 L 的木棒。输入数据保证删除时集合中必定存在长度为 L 的木棒，且任意操作后集合都是非空的。
 *
 *
 *
 * 输出描述:
 * 对于每一次操作结束有一次输出，如果集合内的木棒可以构成简单多边形，输出 "Yes" ，否则输出 "No"。
 *
 * 示例1
 * 输入
 * 5
 * 1 1
 * 1 1
 * 1 1
 * 2 1
 * 1 2
 * 输出
 * No
 * No
 * Yes
 * No
 * No
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int num = 0;
        int j = 0;
        int max = 0;

        List<Integer> list = new ArrayList<>();
        while (j++ < n) {
            int i = sc.nextInt();
            int l = sc.nextInt();
            sc.nextLine();
            if (i == 1) {
                list.add(l);
                num += l;
            } else {
                list.remove(list.indexOf(l));
                num -= l;
            }
            Collections.sort(list);

            if(list.size() > 0){
                max = list.get(list.size()-1);
            }
            if (num - max <= max) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}