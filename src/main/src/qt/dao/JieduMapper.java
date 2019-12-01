package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Jiedu;
import qt.bean.JieduExample;

public interface JieduMapper {
    long countByExample(JieduExample example);

    int deleteByExample(JieduExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jiedu record);

    int insertSelective(Jiedu record);

    List<Jiedu> selectByExample(JieduExample example);

    Jiedu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jiedu record, @Param("example") JieduExample example);

    int updateByExample(@Param("record") Jiedu record, @Param("example") JieduExample example);

    int updateByPrimaryKeySelective(Jiedu record);

    int updateByPrimaryKey(Jiedu record);
}