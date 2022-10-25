package staffPackage;
import studentPackage.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Staff extends Student
{
    String Staff_ID,Staff_password;
    void InputStaffToFile() throws FileNotFoundException, IOException
    { 
        BufferedWriter INPUT_STAFF_TO_FILE=new BufferedWriter(new FileWriter("Staff_info.txt",true));
        INPUT_STAFF_TO_FILE.write(Staff_password+" "+Staff_ID);
        INPUT_STAFF_TO_FILE.newLine();
        INPUT_STAFF_TO_FILE.close();
    }
    protected void Create_staff(String Staff_ID, String Staff_password) throws FileNotFoundException, IOException
    {
        this.Staff_ID=Staff_ID;
        this.Staff_password=Staff_password;
        InputStaffToFile();
    }
    void Add_student(String Student_ID, String Student_password, String Student_first_name,String Student_last_name,String Student_number, String Level, String Mail, String batch) throws IOException
    {
        Create_student(Student_ID, Student_password,Student_first_name,Student_last_name,Student_number,Level,Mail,batch);
    }
}
