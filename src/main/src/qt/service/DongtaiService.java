package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Chengguo;
import qt.bean.Dongtai;
import qt.bean.Sy;
import qt.dao.DongtaiMapper;
import qt.dao.SyMapper;

import java.util.List;

@Service
public class DongtaiService {
    @Autowired
    private DongtaiMapper dongtaiMapper;
    public Dongtai get(int id){
        return dongtaiMapper.selectByPrimaryKey(id);
    }
    public List<Dongtai> getall(){
        return   dongtaiMapper.selectByExample(null);
    }

    public void  upadata(Dongtai dongtai){
        dongtaiMapper.updateByPrimaryKeySelective(dongtai);
    }

    public void delete(Dongtai dongtai){
        dongtaiMapper.deleteByPrimaryKey(dongtai.getId());
    }

    public  void save(Dongtai dongtai){
        dongtaiMapper.insertSelective(dongtai);
    }
}
