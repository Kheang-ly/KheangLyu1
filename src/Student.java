import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String sex;
    private String address;
    private float avg;

    public Student(int id, String name, String sex, String address, float avg) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.avg = avg;
    }
    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
    boolean inputInformation( ArrayList<Student> students)
    {
            Scanner input=new Scanner(System.in);
            System.out.print(" Student ID: ");
            id=input.nextInt();
            if(is_ID_available(students,id))
            {
                return true;
            }
            //do while(is_ID_available(students,id))
            input.nextLine();
            System.out.print(" Input Name: ");
            name=input.nextLine();
            System.out.print(" Gender: ");
            sex=input.nextLine();
            System.out.print(" Address: ");
            address=input.nextLine();
            System.out.print(" Average: ");
            avg=input.nextFloat();
            return false;
    }
    void display()
    {
        System.out.println(" Student ID: ".concat(id+""));
        System.out.println(" Student Name: ".concat(name));
        System.out.println(" Sex: ".concat(sex));
        System.out.println(" Address: ".concat(address));
        System.out.println(" Average: ".concat(avg+""));
    }
    boolean is_ID_available(ArrayList<Student> students,int id)
    {
        if(students.size()>0)
        {
            for(int i=0;i<students.size();i++)
            {
                if(students.get(i).getId()==id)
                    return true;
            }
        }
        return false;
    }

}
