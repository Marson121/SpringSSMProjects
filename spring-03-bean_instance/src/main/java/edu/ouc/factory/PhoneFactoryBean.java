package edu.ouc.factory;

import edu.ouc.dao.Impl.PhoneDaoImpl;
import edu.ouc.dao.PhoneDao;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class PhoneFactoryBean implements FactoryBean<PhoneDao> {
    @Override
    public PhoneDao getObject() throws Exception {
        return new PhoneDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return PhoneDao.class;
    }
}
