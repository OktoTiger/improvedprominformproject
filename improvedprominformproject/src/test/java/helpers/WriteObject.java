package helpers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void writeObject(Object object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
