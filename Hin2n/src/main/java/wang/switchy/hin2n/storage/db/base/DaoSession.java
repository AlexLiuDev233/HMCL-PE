package wang.switchy.hin2n.storage.db.base;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import wang.switchy.hin2n.storage.db.base.model.N2NSettingModel;

import wang.switchy.hin2n.storage.db.base.N2NSettingModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig n2NSettingModelDaoConfig;

    private final N2NSettingModelDao n2NSettingModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        n2NSettingModelDaoConfig = daoConfigMap.get(N2NSettingModelDao.class).clone();
        n2NSettingModelDaoConfig.initIdentityScope(type);

        n2NSettingModelDao = new N2NSettingModelDao(n2NSettingModelDaoConfig, this);

        registerDao(N2NSettingModel.class, n2NSettingModelDao);
    }
    
    public void clear() {
        n2NSettingModelDaoConfig.clearIdentityScope();
    }

    public N2NSettingModelDao getN2NSettingModelDao() {
        return n2NSettingModelDao;
    }

}
