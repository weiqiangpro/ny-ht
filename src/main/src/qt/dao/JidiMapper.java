package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Jidi;
import qt.bean.JidiExample;

public interface JidiMapper {
    long countByExample(JidiExample example);

    int deleteByExample(JidiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jidi record);

    int insertSelective(Jidi record);

    List<Jidi> selectByExample(JidiExample example);

    Jidi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jidi record, @Param("example") JidiExample example);

    int updateByExample(@Param("record") Jidi record, @Param("example") JidiExample example);

    int updateByPrimaryKeySelective(Jidi record);

    int updateByPrimaryKey(Jidi record);
}