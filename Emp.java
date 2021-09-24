package p1.p2;

public class Emp {
      public int id;
     public String ename;
     public int sal;
    public Emp()
    {
        id=100;
        ename="AMAN";
        sal=20000;
    }

    public Emp(int id, String ename, int sal)
    {
        this.id = id;
        this.ename = ename;
        this.sal = sal;
    }
    public static int count;
    {
        count++;
    }
    public void display()
    {
        System.out.println(id + " " +ename);
    }
}
