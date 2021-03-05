package CRUD;

import task_1.SanPhamSach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SanPhamSachDAO {
    private static final String SAN_PHAM_FILE_NAME = "Sach.txt";

    public void wirte(List<SanPhamSach> SachList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SAN_PHAM_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(SachList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<SanPhamSach> read() {
        List<SanPhamSach> SachList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SAN_PHAM_FILE_NAME));
            ois = new ObjectInputStream(fis);
            SachList = (List<SanPhamSach>) ois.readObject();

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
        return SachList;
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
