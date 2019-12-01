package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Admin;
import qt.dao.AdminMapper;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;


public int count(Admin admin){
    return adminMapper.countByExample(admin);
}
    public Admin get(String  key){
        return adminMapper.selectByPrimaryKey(key);
    }

    public int update(Admin admin)
    {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    public boolean updatepasswd(String name,String passwd,String passwd1,String passwd2){

        if ( adminMapper.selectByPrimaryKey(name).getUpasswd().equals(passwd)){
            Admin admin = new Admin();
            admin.setUname(name);
            admin.setUpasswd(passwd1);
            adminMapper.updateByPrimaryKeySelective(admin);

            return true;
        }

        return false;
    }

}
