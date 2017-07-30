package newke.retest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 查找和排序
 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
 都按先录入排列在前的规则处理。
 */

class Person implements Comparable{
    private String name;
    private int score;

    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public String toString() {
        return name + " " + score;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            return score - ((Person) o).score;
        }
        return 0;
    }
}

public class ScoreSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int total = sc.nextInt();
            int orderStyle = sc.nextInt();

            Person[] persons = new Person[total];
//            sc.nextLine();
            for (int i = 0; i < total; i++) {
//                String tmp = sc.nextLine();//nextline读入了nextInt留下来的\n
//                String[] tmps = tmp.trim().split(" ");
                Person person = new Person(sc.next(), sc.nextInt());
                persons[i] = person;
            }
            Arrays.sort(persons);
            if (orderStyle == 1) {
                for (Person person : persons) {
                    System.out.println(person);
                }
            } else {
                for (int i = total - 1; i >= 0; i--) {
                    System.out.println(persons[i]);
                }
            }
        }
    }
}
