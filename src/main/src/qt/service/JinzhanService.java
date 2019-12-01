package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Chanchu;
import qt.bean.Jinzhan;
import qt.dao.ChanchuMapper;
import qt.dao.JinzhanMapper;

import java.util.List;

@Service
public class JinzhanService {
    @Autowired
    private JinzhanMapper jinzhanMapper;
    public Jinzhan get(int id){
        return jinzhanMapper.selectByPrimaryKey(id);
    }
    public List<Jinzhan> getall(){
        return   jinzhanMapper.selectByExample(null);
    }
    public void  upadata(Jinzhan jinzhan){
        jinzhanMapper.updateByPrimaryKeySelective(jinzhan);
    }

    public void delete(Jinzhan jinzhan){
        jinzhanMapper.deleteByPrimaryKey(jinzhan.getId());
    }

    public  void save(Jinzhan jinzhan){
        jinzhanMapper.insertSelective(jinzhan);
    }


}
