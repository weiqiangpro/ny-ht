package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Chaxun;
import qt.bean.ChaxunExample;

public interface ChaxunMapper {
    long countByExample(ChaxunExample example);

    int deleteByExample(ChaxunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chaxun record);

    int insertSelective(Chaxun record);

    List<Chaxun> selectByExample(ChaxunExample example);

    Chaxun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chaxun record, @Param("example") ChaxunExample example);

    int updateByExample(@Param("record") Chaxun record, @Param("example") ChaxunExample example);

    int updateByPrimaryKeySelective(Chaxun record);

    int updateByPrimaryKey(Chaxun record);
}