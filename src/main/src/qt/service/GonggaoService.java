package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Fagui;
import qt.bean.Gonggao;
import qt.bean.Sy;
import qt.dao.GonggaoMapper;
import qt.dao.SyMapper;

import java.util.List;

@Service
public class GonggaoService {
    @Autowired
    private GonggaoMapper gonggaoMapper;
    public Gonggao get(int id){
        return gonggaoMapper.selectByPrimaryKey(id);
    }
    public List<Gonggao> getall(){
        return   gonggaoMapper.selectByExample(null);
    }

    public void  upadata(Gonggao gonggao){
        gonggaoMapper.updateByPrimaryKeySelective(gonggao);
    }

    public void delete(Gonggao gonggao){
        gonggaoMapper.deleteByPrimaryKey(gonggao.getId());
    }

    public  void save(Gonggao gonggao){
        gonggaoMapper.insertSelective(gonggao);
    }

}
