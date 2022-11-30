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
    Boolean Add_student(String Student_ID, String Student_password, String Student_first_name,String Student_last_name,String Student_number, String Level, String Mail, String batch) throws IOException
    {
        if(Create_student(Student_ID, Student_password,Student_first_name,Student_last_name,Student_number,Level,Mail,batch))
        {
        	return true;
        }
        return false;
    }
    void Delete_student(String val) throws FileNotFoundException, IOException
    {
    	Remove_student(val);
    }
    void Modify_student(int i,String Student_ID, String Student_password, String Student_first_name, String Student_last_name,
    		  String Level, String Student_phone_number, String Student_mail, String Student_batch) throws FileNotFoundException, IOException
    {
    	replaceStudentInFile(i,Student_ID,Student_password,  Student_first_name, Student_last_name, Level, Student_phone_number,Student_mail, Student_batch);
    }
}
