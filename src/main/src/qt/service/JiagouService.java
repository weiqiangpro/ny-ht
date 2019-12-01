package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Jiagou;
import qt.bean.Xinwen;
import qt.dao.JiagouMapper;
import qt.dao.XinwenMapper;

import java.util.List;

@Service
public class JiagouService {
    @Autowired
    private JiagouMapper jiagouMapper;
    public Jiagou get(int id){
        return jiagouMapper.selectByPrimaryKey(id);
    }
    public List<Jiagou> getall(){
        return   jiagouMapper.selectByExample(null);
    }
    public void  upadata(Jiagou jiagou){
        jiagouMapper.updateByPrimaryKeySelective(jiagou);
    }

    public void delete(Jiagou jiagou){
        jiagouMapper.deleteByPrimaryKey(jiagou.getId());
    }

    public  void save(Jiagou jiagou){
        jiagouMapper.insertSelective(jiagou);
    }


}
