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
	        return "Student(ѧ����Ϣ):  ������" + name
	                + " ѧ�ţ�" + number + " �Ա�" + sex ;
	    }
	 void tuike() {
    	 g=null;
     }
	 void delete() {
	      if(g== null);{
	  	  System.out.println("ѧ�����˴�ѧ����γ�");}
	  	 
	    }
}
