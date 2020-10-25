package thirdjava;

public class Teacher extends Person {  
    String lesson;
    String level;
    public Teacher(int number, String name, String sex, String lesson, String level){
        super(number,name,sex);
        this.number = number;
		this.name = name;
		this.sex = sex;
		this.lesson = lesson;
		this.level = level;
    }

    public String toString(){
        return "Teacher(教师信息):" + " 编号：" + number + " 姓名：" + name + " 性别：" + sex 
        		+ " 所授课程：" + lesson + " 教师水平 ：" + level;}
    
    }