package com.guircai.mysql;

import com.guircai.data.DataSaveService;

/**
 * @author Guircai
 **/
public class MySQLSaveService implements DataSaveService {

    @Override
    public void saveData(String data) {
        System.out.println("MySQL保存了数据......" + data);
    }
}
