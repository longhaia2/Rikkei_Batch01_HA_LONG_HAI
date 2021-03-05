package CRUD;

import task_1.DoChoiTreEm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DoChoiTreEmDAO {
    private static final String SAN_PHAM_FILE_NAME = "Dochoitreem.txt";

    public void wirte(List<DoChoiTreEm> doChoiTreEmList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SAN_PHAM_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(doChoiTreEmList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<DoChoiTreEm> read() {
        List<DoChoiTreEm> doChoiTreEm = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SAN_PHAM_FILE_NAME));
            ois = new ObjectInputStream(fis);
            doChoiTreEm = (List<DoChoiTreEm>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return doChoiTreEm;
    }
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
