package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Guandian;
import qt.bean.Jianjie;
import qt.bean.Sy;
import qt.dao.JianjieMapper;
import qt.dao.SyMapper;

import java.util.List;

@Service
public class JianjieService {
    @Autowired
    private JianjieMapper jianjieMapper;
    public Jianjie get(int id){
        return jianjieMapper.selectByPrimaryKey(id);
    }
    public List<Jianjie> getall(){
        return   jianjieMapper.selectByExample(null);
    }

    public void  upadata(Jianjie jianjie){
        jianjieMapper.updateByPrimaryKeySelective(jianjie);
    }

    public void delete(Jianjie jianjie){
        jianjieMapper.deleteByPrimaryKey(jianjie.getId());
    }

    public  void save(Jianjie jianjie){
        jianjieMapper.insertSelective(jianjie);
    }

}
