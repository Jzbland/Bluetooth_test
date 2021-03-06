package com.beestar.ble.ble.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.beestar.ble.ble.ui.Equipment_DeviceDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig equipment_DeviceDaoConfig;

    private final Equipment_DeviceDao equipment_DeviceDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        equipment_DeviceDaoConfig = daoConfigMap.get(Equipment_DeviceDao.class).clone();
        equipment_DeviceDaoConfig.initIdentityScope(type);

        equipment_DeviceDao = new Equipment_DeviceDao(equipment_DeviceDaoConfig, this);

        registerDao(Equipment_Device.class, equipment_DeviceDao);
    }
    
    public void clear() {
        equipment_DeviceDaoConfig.clearIdentityScope();
    }

    public Equipment_DeviceDao getEquipment_DeviceDao() {
        return equipment_DeviceDao;
    }

}
