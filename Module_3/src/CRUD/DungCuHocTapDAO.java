package CRUD;

import task_1.DungCuHocTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DungCuHocTapDAO {
    private static final String SAN_PHAM_FILE_NAME = "Dodunghoctap.txt";

    public void wirte(List<DungCuHocTap> dungCuHocTap) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SAN_PHAM_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dungCuHocTap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<DungCuHocTap> read() {
        List<DungCuHocTap> dungCuHocTap = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SAN_PHAM_FILE_NAME));
            ois = new ObjectInputStream(fis);
            dungCuHocTap = (List<DungCuHocTap>) ois.readObject();

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
        return dungCuHocTap;
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
