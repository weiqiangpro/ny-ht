package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Dangdongtai;
import qt.dao.DangdongtaiMapper;

import java.util.List;

@Service
public class DangdongtaiService {
    @Autowired
    private DangdongtaiMapper dangdongtaiMapper;
    public Dangdongtai get(int id){
        return dangdongtaiMapper.selectByPrimaryKey(id);
    }
    public List<Dangdongtai> getall(){
        return   dangdongtaiMapper.selectByExample(null);
    }
    public void  upadata(Dangdongtai dangdongtai){
        dangdongtaiMapper.updateByPrimaryKeySelective(dangdongtai);
    }

    public void delete(Dangdongtai dangdongtai){
        dangdongtaiMapper.deleteByPrimaryKey(dangdongtai.getId());
    }

    public  void save(Dangdongtai dangdongtai){
        dangdongtaiMapper.insertSelective(dangdongtai);
    }


}
