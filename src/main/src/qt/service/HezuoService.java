package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Chengguo;
import qt.bean.Hezuo;
import qt.dao.ChengguoMapper;
import qt.dao.HezuoMapper;

import java.util.List;

@Service
public class HezuoService {
    @Autowired
    private HezuoMapper hezuoMapper;
    public Hezuo get(int id){
        return hezuoMapper.selectByPrimaryKey(id);
    }
    public List<Hezuo> getall(){
        return   hezuoMapper.selectByExample(null);
    }
    public void  upadata(Hezuo hezuo){
        hezuoMapper.updateByPrimaryKeySelective(hezuo);
    }

    public void delete(Hezuo hezuo){
        hezuoMapper.deleteByPrimaryKey(hezuo.getId());
    }

    public  void save(Hezuo hezuo){
        hezuoMapper.insertSelective(hezuo);
    }


}
