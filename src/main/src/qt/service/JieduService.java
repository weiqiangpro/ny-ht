package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Jiedu;
import qt.dao.JieduMapper;

import java.util.List;

@Service
public class JieduService {
    @Autowired
    private JieduMapper jieduMapper;
    public Jiedu get(int id){
        return jieduMapper.selectByPrimaryKey(id);
    }
    public List<Jiedu> getall(){
      return   jieduMapper.selectByExample(null);
    }

    public void  upadata(Jiedu jiedu){
        jieduMapper.updateByPrimaryKeySelective(jiedu);
    }

    public void delete(Jiedu jiedu){
        jieduMapper.deleteByPrimaryKey(jiedu.getId());
    }

    public  void save(Jiedu jiedu){
        jieduMapper.insertSelective(jiedu);
    }
}
