# 一、实验内容
  ### 1、初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法
  ### 2、掌握面向对象的类设计方法（属性、方法）
  ### 3、掌握类的继承用法，通过构造方法实例化对象
  ### 4、学会使用super()，用于实例化子类
  ### 5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中

# 二、实验要求
  ## 说明： 学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
          对象：	人员（编号、姓名、性别）
                教师（编号、姓名、性别、所授课程）
			          学生（编号、姓名、性别、所选课程）
			          课程（编号、课程名称、上课地点、时间、授课教师）
                

# 三、实验方法
  ### 1、先定义课程方面的基础信息
  ### 2、构造父类Person，成为其他子类的基础和通用的对象
  ### 3、在子类中编辑父类所没有的对象，再利用super调用子类函数
  ### 4、用this给每一个变量赋值
  ### 5、在test中输出所有结果

# 四、核心方法
``` package thirdjava;

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

```

# 五、实验结果

![结果](https://github.com/3256268435/Java-3/blob/main/%E7%BB%93%E6%9E%9C.png)

# 六、实验感想
刚开始学的时候对于方法，构造方法一直弄混分不清楚，但通过这次实验，自己有了一些理解，关于方法可以有返回值也可以没有没有返回值，一般用于限定返回值类型和输入输出值。关于构造方法，
首先一定没有返回值，其次方法名与类名一直，一般用于赋值。同时也进一步理解this用法，区别同名。
