import java.util.Scanner;
import java.util.ArrayList;
public class SubClass {
    public static int menu()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("==========================Student Management System===============================");
        System.out.println(" 1.Enroll Student ");
        System.out.println(" 2.Show Student Information ");
        System.out.println(" 3.Search Student ");
        System.out.println(" 4.Delete Student ");
        System.out.println(" 5.Update Student ");
        System.out.println(" 6.Exit ");
        int n=0;
        do
        {
            System.out.print(" Please Select Your option: ");
            n= input.nextInt();
        }while(n<=0 || n>6);
        return n;
    }
    public static boolean is_id_available(ArrayList<Student> students,int id)
    {
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getId()==id)
                return true;
        }
        return false;
    }
    public static void input(ArrayList<Student> student)
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print(" Input number of student: ");
        n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            Student stu=new Student();
            boolean stu_info=stu.inputInformation(student);
            if(stu_info)
            {
                System.out.println(" ID is already exist ");
                return;
            }
            else
            {
                student.add(stu);
            }
        }
    }
    public static void displayInfo(ArrayList<Student> students)
    {
        System.out.println("=============================Student Information==============================");
        for(int i=0;i<students.size();i++)
        {
            Student stu=students.get(i);
            stu.display();
            System.out.println();
        }
    }
    public static void search(ArrayList<Student> students)
    {
        System.out.println(" Enter Student ID: ");
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        for(int i=0;i<students.size();i++)
        {
            if(is_id_available(students,x))
            {
                Student stu=students.get(i);
                System.out.println(" Student id: ".concat(stu.getId()+""));
                System.out.println(" Student Name: ".concat(stu.getName()));
                System.out.println(" Sex: ".concat(stu.getSex()));
                System.out.println(" Address: ".concat(stu.getAddress()));
                System.out.println(" Average: ".concat(stu.getAvg()+""));
                System.out.println("Searched!!!");
                System.out.println();
                return;
            }
        }
        System.out.println(" Student ID not found ");
    }

}
