package adminPackage;
import staffPackage.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Admin extends Staff
{
    String Admin_password, Admin_ID;
    
    void InputAdminToFile() throws FileNotFoundException, IOException
    {
        BufferedWriter INPUT_ADMIN_TO_FILE = new BufferedWriter(new FileWriter("Admin_info.txt",true)); // true --> append
        INPUT_ADMIN_TO_FILE.write(Admin_ID+" "+Admin_password+"\n");
        INPUT_ADMIN_TO_FILE.close();
    }
    public void Admin_register(String Admin_password, String Admin_ID) throws IOException
    {
        this. Admin_password=Admin_password;
        this.Admin_ID=Admin_ID;
        InputAdminToFile();
    }
    protected void Add_staff(String Staff_ID, String Staff_password) throws FileNotFoundException, IOException
    {
        Create_staff(Staff_ID,Staff_password);
    }
    void View_feedback() throws IOException
    {
       
    }
    void Address_feedback(String status,String changeFrom,int lineNumber) throws IOException
    {
     	 BufferedReader DELETE_ISSUE_FROM_FILE = null;
    	 BufferedWriter COPY_ISSUES_TO_FILE = null;
    	 BufferedWriter UPDATE_ISSUE_TO_FILE = null;
    	 File tempFile=null;
    	 File mainFile=null;
      if(status.equals("inProgress") && changeFrom.equals("pending"))
      {
    	  tempFile = new File("temp.txt"); //deleting the said line from pending file
    	  mainFile = new File("Student_pending_issues.txt");
    	  DELETE_ISSUE_FROM_FILE = new BufferedReader(new FileReader(mainFile));
    	  COPY_ISSUES_TO_FILE = new BufferedWriter(new FileWriter(tempFile));
    	  UPDATE_ISSUE_TO_FILE = new BufferedWriter(new FileWriter("Student_inProgress_issues.txt"));
      }
      String Line = null;
	  int reached = 0,cnt=0;
	  Boolean done = false;
      while((Line = DELETE_ISSUE_FROM_FILE.readLine())!=null)
	  {
		   if(reached==lineNumber && done==false)
    		{
	    		for(int k=0;k<9;++k) //skip 10 times
	    			{
	    			  UPDATE_ISSUE_TO_FILE.write(Line);
	    			  UPDATE_ISSUE_TO_FILE.newLine();
	    			  Line=DELETE_ISSUE_FROM_FILE.readLine();
	    			}
	    	UPDATE_ISSUE_TO_FILE.close();
	    	done=true;
	    		
    		}
		   else
		   {
			    COPY_ISSUES_TO_FILE.write(Line);
			    COPY_ISSUES_TO_FILE.newLine();
		    	++cnt;
		    	if(cnt==10 && done==false)
		    		{
			    		++reached;
			    		cnt=0;
		    		}
		   }
	  }
      COPY_ISSUES_TO_FILE.close();
      DELETE_ISSUE_FROM_FILE.close();
      mainFile.delete();
      tempFile.renameTo(mainFile);
      
      
      

    }

}
