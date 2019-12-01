package qt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Keyan;
import qt.dao.KeyanMapper;

import java.util.List;

@Service
public class KeyanService {
    @Autowired
    private KeyanMapper keyanMapper;
    public Keyan get(int id){
        return keyanMapper.selectByPrimaryKey(id);
    }
    public List<Keyan> getall(){
      return   keyanMapper.selectByExample(null);
    }
    public void updata(Keyan keyan){
        keyanMapper.updateByPrimaryKeySelective(keyan);
    }
    public void delete(Keyan keyan){
        keyanMapper.deleteByPrimaryKey(keyan.getId());
    }

}
