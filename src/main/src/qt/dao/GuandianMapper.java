package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Guandian;
import qt.bean.GuandianExample;

public interface GuandianMapper {
    long countByExample(GuandianExample example);

    int deleteByExample(GuandianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Guandian record);

    int insertSelective(Guandian record);

    List<Guandian> selectByExample(GuandianExample example);

    Guandian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Guandian record, @Param("example") GuandianExample example);

    int updateByExample(@Param("record") Guandian record, @Param("example") GuandianExample example);

    int updateByPrimaryKeySelective(Guandian record);

    int updateByPrimaryKey(Guandian record);
}