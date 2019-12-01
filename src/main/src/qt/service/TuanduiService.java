package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Baodao;
import qt.bean.Tuandui;
import qt.dao.BaodaoMapper;
import qt.dao.TuanduiMapper;

import java.util.List;

@Service
public class TuanduiService {
    @Autowired
    private TuanduiMapper tuanduiMapper;
    public Tuandui get(int id){
        return tuanduiMapper.selectByPrimaryKey(id);
    }
    public List<Tuandui> getall(){
        return   tuanduiMapper.selectByExample(null);
    }
    public void  upadata(Tuandui tuandui){
        tuanduiMapper.updateByPrimaryKeySelective(tuandui);
    }

    public void delete(Tuandui tuandui){
        tuanduiMapper.deleteByPrimaryKey(tuandui.getId());
    }

    public  void save(Tuandui tuandui){
        tuanduiMapper.insertSelective(tuandui);
    }


}
