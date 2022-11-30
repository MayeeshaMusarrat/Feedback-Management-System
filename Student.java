package studentPackage;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Student
{
    String Student_first_name,Student_last_name, Student_password, Student_ID,Level,Student_phone_number,Student_mail, Student_batch;
    String stu_sev, stu_cat, stu_subcat,stu_loc, stu_submatter, stu_descrip ,stu_filename,date,time;
    Boolean check=true;
    
    
    void InputStudentIssueToFile() throws FileNotFoundException, IOException
    {
    	// write contents of GUI to file
    	// put endline at the last of each student_issue appended so that it can be differentiated 
    	
    	BufferedWriter LODGE = new BufferedWriter(new FileWriter("Student_pending_issues.txt",true));
    	//System.out.println(Student_ID+" "+stu_cat);
    	LODGE.write(Student_ID);
    	LODGE.newLine();
    	LODGE.write(stu_cat);
    	LODGE.newLine();
    	LODGE.write(stu_subcat);
    	LODGE.newLine();
    	LODGE.write(stu_sev);
    	LODGE.newLine();
    	LODGE.write(stu_loc);
    	LODGE.newLine();
    	LODGE.write(stu_submatter);
    	LODGE.newLine();
    	LODGE.write(stu_filename);
    	LODGE.newLine();
    	LODGE.write(stu_descrip);
    	LODGE.newLine();
    	LODGE.write(date);
    	LODGE.newLine();
    	LODGE.write(time);
    	LODGE.newLine();
    	LODGE.close();
    }
 
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
    public void replaceStudentInFile(int i,String Student_ID, String Student_password, String Student_first_name, String Student_last_name, String Level, String Student_phone_number, String Student_mail, String Student_batch) throws FileNotFoundException, IOException

    {
    	int lineNumber = 0;
    	File tempFile = new File("temp.txt");
    	File delFile = new File("Student_info.txt");
    	BufferedReader DELETE_STUDENT_FROM_FILE = new BufferedReader(new FileReader(delFile));
    	BufferedWriter del = new BufferedWriter(new FileWriter(tempFile));
    	String Line = null,replaceLine=null;
    	while((Line = DELETE_STUDENT_FROM_FILE.readLine())!=null)
    	{
    		++lineNumber;
    		if(lineNumber == i+1)
    		{
                replaceLine = Student_ID+" "+Student_password+" "+Student_first_name+" "+Student_last_name+" "+Level+" "+Student_phone_number+" "+Student_mail+" "+Student_batch;
            	
    		}	
    		else 
    		{
    			del.write(Line);
    		    del.newLine();
    		}
    	}
    	
    	DELETE_STUDENT_FROM_FILE.close();
    	del.close();
    	delFile.delete();
    	tempFile.renameTo(delFile); 
    	
    	BufferedWriter INPUT_STUDENT_TO_FILE=new BufferedWriter(new FileWriter("Student_info.txt",true));
        INPUT_STUDENT_TO_FILE.write(replaceLine);
        INPUT_STUDENT_TO_FILE.newLine();
        INPUT_STUDENT_TO_FILE.close();
    	
    }
    
    public void lodge_Feedback(String ID,String stu_cat,String stu_subcat, String stu_sev,String stu_loc,String stu_submatter,
    		String stu_filename, String stu_descrip, String date,String time) throws FileNotFoundException, IOException
    {
    	this.Student_ID = ID;
    	this.stu_cat = stu_cat;
    	this.stu_subcat = stu_subcat;
    	this.stu_sev = stu_sev;
    	this.stu_loc = stu_loc;
    	this.stu_submatter = stu_submatter;
    	this.stu_filename = stu_filename;
    	this.stu_descrip = stu_descrip;
    	this.date = date;
    	this.time = time;
    	InputStudentIssueToFile();
    	
    }
}
