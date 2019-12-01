package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Dongtai;
import qt.bean.Fagui;
import qt.dao.DongtaiMapper;
import qt.dao.FaguiMapper;

import java.util.List;

@Service
public class FaguiService {
    @Autowired
    private FaguiMapper faguiMapper;
    public Fagui get(int id){
        return faguiMapper.selectByPrimaryKey(id);
    }
    public List<Fagui> getall(){
        return   faguiMapper.selectByExample(null);
    }

    public void  upadata(Fagui fagui){
        faguiMapper.updateByPrimaryKeySelective(fagui);
    }

    public void delete(Fagui fagui){
        faguiMapper.deleteByPrimaryKey(fagui.getId());
    }

    public  void save(Fagui fagui){
        faguiMapper.insertSelective(fagui);
    }


}
