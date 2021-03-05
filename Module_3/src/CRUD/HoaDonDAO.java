package CRUD;

import task_1.HoaDon;
import task_1.SanPhamSach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO {
    private static final String SAN_PHAM_FILE_NAME = "Donhang.txt";

    public void wirte(List<HoaDon> hoaDonList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SAN_PHAM_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(hoaDonList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<HoaDon> read() {
        List<HoaDon> hoaDonList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SAN_PHAM_FILE_NAME));
            ois = new ObjectInputStream(fis);
            hoaDonList = (List<HoaDon>) ois.readObject();

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
        return hoaDonList;
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
