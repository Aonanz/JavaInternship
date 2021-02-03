package Day02.IO流;

import java.io.*;

public class CopyAndPaste {
    public static void main(String[] args) {
        CopyPaste();
    }

    public static void CopyPaste() {

        // 初始化文件输入输出流
        File copyFrom = new File("src/Day02/IO流/From/一个文件");
        File pasteTo = new File("src/Day02/IO流/To/将被替换的文件");
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {

            // 尝试绑定文件路径给输入输出流
            fis = new FileInputStream(copyFrom);
            fos = new FileOutputStream(pasteTo);
            // 缓冲区初始化
            byte[] bs = new byte[1024];

            // 写入长度至少为0的文件
            while (true) {
                int len = fis.read(bs, 0, bs.length);
                if (len <= -1) {
                    break;
                } else {
                    // 条件无误，写入
                    fos.write(bs, 0, len);
                }
            }
            // 捕获找不到文件异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // 捕获输入输出异常
        } catch (IOException e) {
            e.printStackTrace();
            // 最后关闭文件
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

