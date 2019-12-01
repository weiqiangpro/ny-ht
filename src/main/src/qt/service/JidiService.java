package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Jiagou;
import qt.bean.Jidi;
import qt.dao.JiagouMapper;
import qt.dao.JidiMapper;

import java.util.List;

@Service
public class JidiService {
    @Autowired
    private JidiMapper jidiMapper;
    public Jidi get(int id){
        return jidiMapper.selectByPrimaryKey(id);
    }
    public List<Jidi> getall(){
        return   jidiMapper.selectByExample(null);
    }
    public void  upadata(Jidi jidi){
        jidiMapper.updateByPrimaryKeySelective(jidi);
    }

    public void delete(Jidi jidi){
        jidiMapper.deleteByPrimaryKey(jidi.getId());
    }

    public  void save(Jidi jidi){
        jidiMapper.insertSelective(jidi);
    }


}
