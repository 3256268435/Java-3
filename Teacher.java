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
        return "Teacher(��ʦ��Ϣ):" + " ��ţ�" + number + " ������" + name + " �Ա�" + sex 
        		+ " ���ڿγ̣�" + lesson + " ��ʦˮƽ ��" + level;}
    
    }