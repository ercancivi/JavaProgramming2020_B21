package day38_StaticKeyword_Static_Instance;

public class StudentObject {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("Ayse",21,5,'F');

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Erjon",22,6, 'M');

        System.out.println(student1.schoolName); //This is NOT preferred way to call static member
        System.out.println(student2.schoolName); //This is NOT preferred way to call static member

        System.out.println(CybertekStudent.schoolName);//This is preferred way to call static member

        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Afrooz",23,7,'F');


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student1.getSchoolInfo();//This is NOT preferred way to call static member
        student2.getSchoolInfo();//This is NOT preferred way to call static member
        student3.getSchoolInfo();//This is NOT preferred way to call static member

        CybertekStudent.getSchoolInfo();//This is the preferred way to call static member!!!!!



    }


}
