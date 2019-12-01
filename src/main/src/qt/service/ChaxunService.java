package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Chanchu;
import qt.bean.Chaxun;
import qt.bean.Hezuo;
import qt.dao.ChaxunMapper;
import qt.dao.HezuoMapper;

import java.util.List;

@Service
public class ChaxunService {
    @Autowired
    private ChaxunMapper chaxunMapper;
    public Chaxun get(int id){
        return chaxunMapper.selectByPrimaryKey(id);
    }
    public List<Chaxun> getall(){
        return   chaxunMapper.selectByExample(null);
    }
    public void  upadata(Chaxun chaxun){
        chaxunMapper.updateByPrimaryKeySelective(chaxun);
    }

    public void delete(Chaxun chaxun){
        chaxunMapper.deleteByPrimaryKey(chaxun.getId());
    }

    public  void save(Chaxun chaxun){
        chaxunMapper.insertSelective(chaxun);
    }


}
