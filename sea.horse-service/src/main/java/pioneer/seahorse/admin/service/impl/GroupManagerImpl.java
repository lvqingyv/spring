package pioneer.seahorse.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pioneer.seahorse.admin.dao.GroupDao;
import pioneer.seahorse.admin.domain.Group;
import pioneer.seahorse.admin.service.GroupManager;
import pioneer.seahorse.base.service.Impl.GenericTreeManagerImpl;

@Service(value = "groupManager")
public class GroupManagerImpl extends GenericTreeManagerImpl<Group, Long> implements GroupManager {

    GroupDao groupDao;

    @Autowired
    public void setGropuDao(GroupDao groupDao) {
        this.groupDao = groupDao;
        this.treeDao = this.groupDao;
        this.dao = this.treeDao;
    }

}
