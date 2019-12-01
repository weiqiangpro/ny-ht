package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Sy;
import qt.dao.SyMapper;


import java.util.List;

@Service
public class SyService {
    @Autowired
    private SyMapper syMapper;
    public Sy get(int id){
        return syMapper.selectByPrimaryKey(id);
    }
    public List<Sy> getall(){
        return   syMapper.selectByExample(null);
    }

    public void updata(Sy sy){
        syMapper.updateByPrimaryKeySelective(sy);
    }



}
