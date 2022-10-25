package studentPackage;
import java.io.*;
public class Student
{
    String Student_first_name,Student_last_name, Student_password, Student_ID,Level,Student_phone_number,Student_mail, Student_batch;
    void InputStudentToFile() throws FileNotFoundException, IOException
    {
        BufferedWriter INPUT_STUDENT_TO_FILE=new BufferedWriter(new FileWriter("Student_info.txt",true));
        INPUT_STUDENT_TO_FILE.write(Student_ID+" "+Student_password+" "+Student_first_name+" "+Student_last_name+" "+Level+" "+Student_phone_number+" "+Student_mail+" "+Student_batch);
        INPUT_STUDENT_TO_FILE.newLine();
        INPUT_STUDENT_TO_FILE.close();
    }

    public void Create_student(String Student_ID, String Student_password, String Student_first_name, String Student_last_name, String Student_phone_number, String Level, String Student_mail, String Student_batch) throws IOException
    {
        this.Student_ID=Student_ID; 
        this.Student_password=Student_password;
        this.Student_first_name=Student_first_name;
        this.Student_last_name=Student_last_name;
        this.Student_phone_number=Student_phone_number;
        this.Level=Level;
        this.Student_mail = Student_mail;
        this.Student_batch=Student_batch;
        InputStudentToFile();
    }
}
