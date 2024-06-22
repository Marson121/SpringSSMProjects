package edu.ouc.service.Impl;

import edu.ouc.dao.ResourceDao;
import edu.ouc.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/22
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    @Override
    public boolean openUrl(String url, String password) {
        return resourceDao.readResources(url, password);
    }
}
