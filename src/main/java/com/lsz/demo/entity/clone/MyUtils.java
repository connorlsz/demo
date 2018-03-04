package com.lsz.demo.entity.clone;

import java.io.*;

public class MyUtils {

    // 对象的深度克隆
    public static <T extends Serializable> T clone(T obj) throws IOException, ClassNotFoundException {

        // 对象方序列化
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);

        //  反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (T) ois.readObject();
    }
}
