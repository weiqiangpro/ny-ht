package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Baodao;
import qt.bean.Jiagou;
import qt.dao.BaodaoMapper;
import qt.dao.JiagouMapper;

import java.util.List;

@Service
public class BaodaoService {
    @Autowired
    private BaodaoMapper baodaoMapper;
    public Baodao get(int id){
        return baodaoMapper.selectByPrimaryKey(id);
    }
    public List<Baodao> getall(){
        return   baodaoMapper.selectByExample(null);
    }
    public void  upadata(Baodao baodao){
        baodaoMapper.updateByPrimaryKeySelective(baodao);
    }

    public void delete(Baodao baodao){
        baodaoMapper.deleteByPrimaryKey(baodao.getId());
    }

    public  void save(Baodao baodao){
        baodaoMapper.insertSelective(baodao);
    }


}
