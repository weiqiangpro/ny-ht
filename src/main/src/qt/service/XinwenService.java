package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Sy;
import qt.bean.Xinwen;
import qt.dao.SyMapper;
import qt.dao.XinwenMapper;

import java.util.List;

@Service
public class XinwenService {
    @Autowired
    private XinwenMapper xinwenMapper;
    public Xinwen get(int id){
        return xinwenMapper.selectByPrimaryKey(id);
    }
    public List<Xinwen> getall(){
        return   xinwenMapper.selectByExample(null);
    }
    public void  upadata(Xinwen xinwen){
        xinwenMapper.updateByPrimaryKeySelective(xinwen);
    }

    public void delete(Xinwen xinwen){
        xinwenMapper.deleteByPrimaryKey(xinwen.getId());
    }

    public  void save(Xinwen xinwen){
        xinwenMapper.insertSelective(xinwen);
    }


}
