import p1.Stu;
import p1.p2.*;
//1 Explicit
// CWD
// Implicit

import java.util.Scanner;
// subclass implies inheritance
// require for

// package is not metioned as it is in current working directory
public class Demo1 extends Stu
{
    public static void main(String[] args) {
        //Stu obj =new Stu();
        Emp obj1= new Emp(20,"N1",1500);
        Emp obj2=new Emp(21,"N2",1800);
        Emp obj3=new Emp(22,"N3",2_2_0_0);
        // static is used  in Emp class for counting no. of objects creation

       // System.out.println(Emp.count);
       // int res=(obj1.sal+obj2.sal+obj3.sal)/Emp.count;
       // System.out.println((obj1.sal+obj2.sal+obj3.sal)/3);
       // System.out.println(res);
        Demo1 obj =new Demo1();
        System.out.println(obj.rollno);

    }

}
