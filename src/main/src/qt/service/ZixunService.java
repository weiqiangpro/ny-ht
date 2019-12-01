package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Baodao;
import qt.bean.Zixun;
import qt.dao.BaodaoMapper;
import qt.dao.ZixunMapper;

import java.util.List;

@Service
public class ZixunService {
    @Autowired
    private ZixunMapper zixunMapper;
    public Zixun get(int id){
        return zixunMapper.selectByPrimaryKey(id);
    }
    public List<Zixun> getall(){
        return zixunMapper.selectByExample(null);
    }
    public void  upadata(Zixun zixun){
        zixunMapper.updateByPrimaryKeySelective(zixun);
    }

    public void delete(Zixun zixun){
        zixunMapper.deleteByPrimaryKey(zixun.getId());
    }

    public  void save(Zixun zixun){
        zixunMapper.insertSelective(zixun);
    }


}
