import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    public class Group24 {
        public String name, state;
        public static boolean java, softSkills, selenium;
        public LocalDate DoB;
        static {
            java = true;
            softSkills = true;
            selenium = true;
        }
        public Group24() {
        }
        public Group24(String name){
            this.name = name;

        }
        public Group24(String name, String state){
            this(name);
            this.state=state;
        }
        public Group24(String name, String state, LocalDate DoB){
            this(name, state);
            this.DoB = DoB;
        }
        public void isStudying(String a){
            System.out.println(name+" is studying "+a+" now !!");
        }
        public void isStudying(){
            System.out.println(name+" is studying now !!");
        }
        public void isPracticing(){
            System.out.println(name+" is practicing ");
        }
        public void isFlipGridding(){
            System.out.println(name+" is recording flipGrid video");
        }
        public String toString() {
            DateTimeFormatter df =  DateTimeFormatter.ofPattern("MM-dd-yyyy");

            return "Group24{" +
                    "name='" + name + '\'' +
                    ", state='" + state + '\'' +
                    ", DoB=" + DoB.format(df)+" is taking Java class= "+java+", is taking softskills= "+softSkills+
                    ", selenium= "+selenium+
                    '}';
        }
    }

    class Group24Object{
        public static void main(String[] args) {

            Group24 student = new Group24("ercan", "tx", LocalDate.of(2020,12,12));
            System.out.println("student = " + student);

        }

    }
/*
group 24 class
name;
date of birth;
state;
classes :
-Java;
-Softskills;
-Selenium;
construstor
method Study
method practice
method flipGrid
Object class group 24
 */

