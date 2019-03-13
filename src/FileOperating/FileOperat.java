package FileOperating;

import java.io.*;

public class FileOperat {

    /*
    读取文件
     */
    public String FileRead(String filepath)
    {
        StringBuffer txt = new StringBuffer();
        String encoding = "UTF-8";
        File file = new File(filepath);
        if (file.isFile() && file.exists())
        {
            BufferedReader bufferedReader = null;
            try {
                InputStreamReader reader = new InputStreamReader((new FileInputStream(file)), encoding);
                bufferedReader = new BufferedReader(reader);
                String lineTxt = null;
                if ((lineTxt = bufferedReader.readLine()) != null)
                {
                    txt.append(lineTxt);
                    //这里可以加自己的操作，将数据放入集合或者数字，以便放入数据库
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return txt.toString();
    }

    /*
    将字符串的数据写入到文件
     */
    public void writeFile(String data, String filePath)
    {
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
