package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Tuandui;
import qt.bean.TuanduiExample;

public interface TuanduiMapper {
    long countByExample(TuanduiExample example);

    int deleteByExample(TuanduiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tuandui record);

    int insertSelective(Tuandui record);

    List<Tuandui> selectByExample(TuanduiExample example);

    Tuandui selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tuandui record, @Param("example") TuanduiExample example);

    int updateByExample(@Param("record") Tuandui record, @Param("example") TuanduiExample example);

    int updateByPrimaryKeySelective(Tuandui record);

    int updateByPrimaryKey(Tuandui record);
}