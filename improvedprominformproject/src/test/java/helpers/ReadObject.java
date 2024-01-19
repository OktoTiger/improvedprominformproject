package helpers;

import api.model.DelegateResponseBodyModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static int readIdInDelegateObject() {
        int idd = 0;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            DelegateResponseBodyModel delegateResponseBodyModel = (DelegateResponseBodyModel) ois.readObject();
            idd = delegateResponseBodyModel.getIdd();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return idd;
    }

}
