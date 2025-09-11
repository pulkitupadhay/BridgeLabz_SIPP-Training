import java.io.*;

class UserData implements Serializable {
    String name = "Yash";
}

public class BackupSerialization {
    public static void main(String[] args) throws Exception {
        UserData u = new UserData();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.dat"));
        out.writeObject(u);
        out.close();
        System.out.println("Data serialized");
    }
}
