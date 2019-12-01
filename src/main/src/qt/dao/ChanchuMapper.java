package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Chanchu;
import qt.bean.ChanchuExample;

public interface ChanchuMapper {
    long countByExample(ChanchuExample example);

    int deleteByExample(ChanchuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chanchu record);

    int insertSelective(Chanchu record);

    List<Chanchu> selectByExample(ChanchuExample example);

    Chanchu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chanchu record, @Param("example") ChanchuExample example);

    int updateByExample(@Param("record") Chanchu record, @Param("example") ChanchuExample example);

    int updateByPrimaryKeySelective(Chanchu record);

    int updateByPrimaryKey(Chanchu record);
}