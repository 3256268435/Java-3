package thirdjava;

public class test {
    public static void main(String[] args) {
    	System.out.println("ѧ��ѡ��ϵͳ");
    	Student a = new Student(2019310629, "����", "MALE");
        System.out.println("ѧ����Ϣ");
        System.out.println(a);
        Teacher d = new Teacher(01, "�ڴ���", "FEMALE", "��ѧ����", "�����ʦ");
        Teacher e = new Teacher(02, "������", "MALE", "�����ݵ���", "����");
        Teacher f = new Teacher(03, "����", "MALE", "��������", "��ͨ��ʦ");
        System.out.println("��ʦ��Ϣ");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        Course g = new Course("��ѧ����", 01, "��207", 90f);
        Course h = new Course("�����ݵ���", 02, "��0915", 90f);
        Course i = new Course("��������", 03, "ƽ��", 180f);
        System.out.println("�γ���Ϣ");
        System.out.println(g); 
        System.out.println(h);
        System.out.println(i);
        a.tuike();
        a.delete();
        System.out.println("ѧ���γ���Ϣ");
        System.out.println(a);
        Teacher x = new Teacher(02, "������", "MALE", "�����ݵ���", "����");
        Teacher y = new Teacher(03, "����", "MALE", "��������", "��ͨ��ʦ");
        System.out.println(x);
        System.out.println(y);
   
}
}   
