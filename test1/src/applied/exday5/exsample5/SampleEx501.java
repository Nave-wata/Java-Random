package applied.exday5.exsample5;

import java.util.*;

public class SampleEx501 {
    // 今出てる警告はSampleEx502.javaで解決する
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int i;

        al.add(new Student("安藤一郎", 1, 1));
        al.add(new Student("伊藤花子", 1, 2));
        al.add(new Student("太田たかし", 2, 3));
        al.add(new Student("加藤紀子", 2, 4));
        al.add(new Student("木田直美", 3, 5));

        al.remove(3);
        for (i = 0; i < al.size(); i++) {
            Student s = (Student) al.get(i);
            System.out.println("番号：" + s.getNumber() + "名前：" + s.getName() + "学年：" + s.getGrade());
        }
    }
}
