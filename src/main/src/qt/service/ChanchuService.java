package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Baodao;
import qt.bean.Chanchu;
import qt.bean.Tuandui;
import qt.dao.ChanchuMapper;
import qt.dao.TuanduiMapper;

import java.util.List;

@Service
public class ChanchuService {
    @Autowired
    private ChanchuMapper chanchuMapper;
    public Chanchu get(int id){
        return chanchuMapper.selectByPrimaryKey(id);
    }
    public List<Chanchu> getall(){
        return   chanchuMapper.selectByExample(null);
    }
    public void  upadata(Chanchu chanchu){
        chanchuMapper.updateByPrimaryKeySelective(chanchu);
    }

    public void delete(Chanchu chanchu){
        chanchuMapper.deleteByPrimaryKey(chanchu.getId());
    }

    public  void save(Chanchu chanchu){
        chanchuMapper.insertSelective(chanchu);
    }


}
