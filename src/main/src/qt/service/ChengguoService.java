package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Chaxun;
import qt.bean.Chengguo;
import qt.bean.Jinzhan;
import qt.dao.ChengguoMapper;
import qt.dao.JinzhanMapper;

import java.util.List;

@Service
public class ChengguoService {
    @Autowired
    private ChengguoMapper chengguoMapper;
    public Chengguo get(int id){
        return chengguoMapper.selectByPrimaryKey(id);
    }
    public List<Chengguo> getall(){
        return   chengguoMapper.selectByExample(null);
    }
    public void  upadata(Chengguo chengguo){
        chengguoMapper.updateByPrimaryKeySelective(chengguo);
    }

    public void delete(Chengguo chengguo){
        chengguoMapper.deleteByPrimaryKey(chengguo.getId());
    }

    public  void save(Chengguo chengguo){
        chengguoMapper.insertSelective(chengguo);
    }


}
