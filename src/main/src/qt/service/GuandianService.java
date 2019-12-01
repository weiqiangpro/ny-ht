package qt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Gonggao;
import qt.bean.Guandian;
import qt.bean.Keyan;
import qt.dao.GuandianMapper;
import qt.dao.KeyanMapper;

import java.util.List;

@Service
public class GuandianService {
    @Autowired
    private GuandianMapper guandianMapper;
    public Guandian get(int id){
        return guandianMapper.selectByPrimaryKey(id);
    }
    public List<Guandian> getall(){
      return   guandianMapper.selectByExample(null);
    }

    public void  upadata(Guandian guandian){
        guandianMapper.updateByPrimaryKeySelective(guandian);
    }

    public void delete(Guandian guandian){
        guandianMapper.deleteByPrimaryKey(guandian.getId());
    }

    public  void save(Guandian guandian){
        guandianMapper.insertSelective(guandian);
    }
}
