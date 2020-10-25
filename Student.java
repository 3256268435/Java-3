package thirdjava;

public class Student extends Person{ 
    String g;
    public Student(int number, String name,String sex) {
		super(number,name,sex);
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	 public String toString(){
	        return "Student(学生信息):  姓名：" + name
	                + " 学号：" + number + " 性别：" + sex ;
	    }
	 void tuike() {
    	 g=null;
     }
	 void delete() {
	      if(g== null);{
	  	  System.out.println("学生已退大学物理课程");}
	  	 
	    }
}
