package thirdjava;

public class test {
    public static void main(String[] args) {
    	System.out.println("学生选课系统");
    	Student a = new Student(2019310629, "张三", "MALE");
        System.out.println("学生信息");
        System.out.println(a);
        Teacher d = new Teacher(01, "于春娜", "FEMALE", "大学物理", "资深教师");
        Teacher e = new Teacher(02, "张晓明", "MALE", "大数据导论", "教授");
        Teacher f = new Teacher(03, "金玲", "MALE", "金属工程", "普通教师");
        System.out.println("教师信息");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        Course g = new Course("大学物理", 01, "教207", 90f);
        Course h = new Course("大数据导论", 02, "综0915", 90f);
        Course i = new Course("金属工程", 03, "平方", 180f);
        System.out.println("课程信息");
        System.out.println(g); 
        System.out.println(h);
        System.out.println(i);
        a.tuike();
        a.delete();
        System.out.println("学生课程信息");
        System.out.println(a);
        Teacher x = new Teacher(02, "张晓明", "MALE", "大数据导论", "教授");
        Teacher y = new Teacher(03, "金玲", "MALE", "金属工程", "普通教师");
        System.out.println(x);
        System.out.println(y);
   
}
}   
