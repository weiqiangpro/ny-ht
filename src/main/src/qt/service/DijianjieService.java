package qt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qt.bean.Baodao;
import qt.bean.Dijianjie;
import qt.dao.BaodaoMapper;
import qt.dao.DijianjieMapper;

import java.util.List;

@Service
public class DijianjieService {
    @Autowired
    private DijianjieMapper dijianjieMapper;
    public List<Dijianjie> getall(){
        return   dijianjieMapper.selectByExample(null);
    }
    public void  upadata(Dijianjie dijianjie){
        dijianjieMapper.updateByPrimaryKeySelective(dijianjie);
    }
}
