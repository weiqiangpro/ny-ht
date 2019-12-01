package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Fagui;
import qt.bean.FaguiExample;

public interface FaguiMapper {
    long countByExample(FaguiExample example);

    int deleteByExample(FaguiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fagui record);

    int insertSelective(Fagui record);

    List<Fagui> selectByExample(FaguiExample example);

    Fagui selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fagui record, @Param("example") FaguiExample example);

    int updateByExample(@Param("record") Fagui record, @Param("example") FaguiExample example);

    int updateByPrimaryKeySelective(Fagui record);

    int updateByPrimaryKey(Fagui record);
}