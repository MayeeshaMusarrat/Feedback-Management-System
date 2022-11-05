package studentPackage;
import java.io.*;

import javax.swing.JOptionPane;
public class Student
{
    String Student_first_name,Student_last_name, Student_password, Student_ID,Level,Student_phone_number,Student_mail, Student_batch;
    Boolean check=true;
    void InputStudentToFile() throws FileNotFoundException, IOException
    {
    	BufferedReader CHECK = new BufferedReader(new FileReader("Student_info.txt"));
    	String Line = null;
    	while((Line=CHECK.readLine())!=null)
    	{
    		String[] spliced = Line.split("\\s+");
    		if(spliced[0].equals(Student_ID))
    		{
    			JOptionPane.showMessageDialog(null, "Duplicate Student ID");
    			check = false;
    			break;
    		}
    	}
    	if(check)
    	{ 
	    	BufferedWriter INPUT_STUDENT_TO_FILE=new BufferedWriter(new FileWriter("Student_info.txt",true));
	        INPUT_STUDENT_TO_FILE.write(Student_ID+" "+Student_password+" "+Student_first_name+" "+Student_last_name+" "+Level+" "+Student_phone_number+" "+Student_mail+" "+Student_batch);
	        INPUT_STUDENT_TO_FILE.newLine();
	        INPUT_STUDENT_TO_FILE.close();
    	}
    	CHECK.close();
    }
    
    void DeleteStudentFromFile(String val) throws FileNotFoundException, IOException
    {
    	File tempFile = new File("temp.txt");
    	File delFile = new File("Student_info.txt");
    	BufferedReader DELETE_STUDENT_FROM_FILE = new BufferedReader(new FileReader(delFile));
    	BufferedWriter del = new BufferedWriter(new FileWriter(tempFile));
    	String Line = null;
    	while((Line = DELETE_STUDENT_FROM_FILE.readLine())!=null)
    	{
    		String[] spliced = Line.split("\\s+");
    		if(spliced[0].equals(val)==true)
    			  continue;
		    del.write(Line);
		    del.newLine();
    	}
    	DELETE_STUDENT_FROM_FILE.close();
    	del.close();
    	delFile.delete();
    	tempFile.renameTo(delFile); 
    }
    
    public Boolean Create_student(String Student_ID, String Student_password, String Student_first_name, String Student_last_name, String Student_phone_number, String Level, String Student_mail, String Student_batch) throws IOException
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
        return check;
    }
    public void Remove_student(String val) throws FileNotFoundException, IOException
    {
    	DeleteStudentFromFile(val);
    }
}
