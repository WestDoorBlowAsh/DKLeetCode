package com.tool;

import java.io.*;
import java.lang.reflect.Array;

import net.sf.json.*;
import net.sf.json.util.JSONUtils;

public class DKFile {

    /**
     * 读取json文件，返回json串
     * @param fileName
     * @return
     */
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    
    public static void main(String[] args) {
    
        DKFile obj = new DKFile();

        String path = obj.getClass().getResource("sortData.json").getPath();
        String jsonString = obj.readJsonFile(path);
        JSONObject jobj = JSONObject.fromObject(jsonString);

        JSONArray arr = jobj.getJSONArray("arr");
        Object[] objArr = arr.toArray();

        System.out.println(objArr.length);

    }
}
