package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Chaxun;
import qt.bean.Wenhua;
import qt.dao.ChaxunMapper;
import qt.dao.WenhuaMapper;

import java.util.List;

@Service
public class WenhuaService {
    @Autowired
    private WenhuaMapper wenhuaMapper;
    public Wenhua get(int id){
        return wenhuaMapper.selectByPrimaryKey(id);
    }
    public List<Wenhua> getall(){
        return   wenhuaMapper.selectByExample(null);
    }
    public void  upadata(Wenhua wenhua){
        wenhuaMapper.updateByPrimaryKeySelective(wenhua);
    }

    public void delete(Wenhua wenhua){
        wenhuaMapper.deleteByPrimaryKey(wenhua.getId());
    }

    public  void save(Wenhua wenhua){
        wenhuaMapper.insertSelective(wenhua);
    }


}
