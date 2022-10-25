package adminPackage;
import staffPackage.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
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
    void Admin_login()
    {

    }
    void Add_staff(String Staff_ID, String Staff_password) throws FileNotFoundException, IOException
    {
        Create_staff(Staff_ID,Staff_password);
    }
    void View_feedback() throws IOException
    {
       /* BufferedReader in = new BufferedReader(new FileReader("Student_Issues.txt"));
        String line = in.readLine();
        int index=1;
        while (line != null) {
            System.out.println(index + "   "+ line + " "+Global_variable.Status_of_issue);
            line = in.readLine();
            ++index;
        }
        in.close();*/
    }
    void Address_feedback() throws IOException
    {
       /* View_feedback();
        String status_user[]={"Pending", "In-progress", "Responded"};
        System.out.print("Choose issue number to solve: ");
        try (Scanner input = new Scanner(System.in)) {
			int index_user=input.nextInt();
			Addressed_issue_status();
			int status=input.nextInt();
			BufferedReader in = new BufferedReader(new FileReader("Student_Issues.txt"));
			String line = in.readLine();
			int Line_number=1;
			while (line != null) {
			    line = in.readLine();
			    if(Line_number==index_user)
			    {
			        gv.Status_of_issue=status_user[status-1];
			        break;
			    }
			    ++Line_number;
			}
			in.close();
		}*/

    }

}
