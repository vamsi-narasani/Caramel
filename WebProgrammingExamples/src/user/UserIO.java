package user;

import java.io.*;

public class UserIO{
    public synchronized static void addRecord(User user, String fileName) throws IOException{
	PrintWriter out = new PrintWriter(new FileWriter(fileName, true));
        out.println(user.getEmailAddress()+ "|"
                    + user.getFirstName() + "|"
                    + user.getLastName());

        out.close();
    }
}
