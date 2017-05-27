package com.beestar.ble.ble.greendao;

import android.content.Context;

import java.util.List;

/**
 * Created by guzhen on 2017/4/11.
 */
public class CommonUtils {
    //TAG
    private static final String TAG = CommonUtils.class.getSimpleName();

    private DaoManager daoManager;

    //构造方法
    public CommonUtils(Context context) {
        daoManager = DaoManager.getInstance();
        daoManager.initManager(context);
    }

    /**
     * 对数据库中student表的插入操作
     *
     * @param student
     * @return
     */
    public boolean insertStudent(Equipment_Device equipment_device) {
        boolean flag = false;
        flag = daoManager.getDaoSession().insert(equipment_device) != -1 ? true : false;
        return flag;
    }

    /**
     * 批量插入
     *
     * @param equipment_device
     * @return
     */
    public boolean inserMultStudent(final List<Equipment_Device> equipment_device) {
        //标识
        boolean flag = false;
        try {
            //插入操作耗时
            daoManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (Equipment_Device student : equipment_device) {
                        daoManager.getDaoSession().insertOrReplace(student);
                    }
                }
            });
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 修改
     *
     * @param equipment_device
     * @return
     */
    public boolean updateStudent(Equipment_Device equipment_device) {
        boolean flag = false;
        try {
            daoManager.getDaoSession().update(equipment_device);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除
     *
     * @param equipment_device
     * @return
     */
    public boolean deleteStudent(Equipment_Device equipment_device) {
        boolean flag = false;
        try {
            //删除指定ID
            daoManager.getDaoSession().delete(equipment_device);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //daoManager.getDaoSession().deleteAll(); //删除所有记录
        return flag;
    }

    /**
     * 查询单条
     *
     * @param key
     * @return
     */
    public Equipment_Device listOneStudent(long key) {
        return daoManager.getDaoSession().load(Equipment_Device.class, key);
    }

    /**
     * 全部查询
     *
     * @return
     */
    public List<Equipment_Device> listAll() {
        return daoManager.getDaoSession().loadAll(Equipment_Device.class);
    }

    /**
     * 原生查询
     */
    public void queryNative() {
//        //查询条件
//        String where = "where name like ? and _id > ?";
//        //使用sql进行查询
//        List<Equipment_Device> list = daoManager.getDaoSession().queryRaw(Equipment_Device.class, where,
//                new String[]{"%l%", "6"});
//        Log.i(TAG, list + "");
    }

    /**
     * QueryBuilder查询大于
     */
    public void queryBuilder() {
//        //查询构建器
//        QueryBuilder<Equipment_Device> queryBuilder = daoManager.getDaoSession().queryBuilder(Equipment_Device.class);
//
//

    }

}
