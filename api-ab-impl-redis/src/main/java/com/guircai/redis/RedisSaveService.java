package com.guircai.redis;

import com.guircai.data.DataSaveService;

/**
 * @author Guircai
 **/
public class RedisSaveService implements DataSaveService {

    @Override
    public void saveData(String data) {
        System.out.println("Redis保存了数据......" + data);
    }
}
