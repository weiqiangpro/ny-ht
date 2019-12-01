package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Jinzhan;
import qt.bean.JinzhanExample;

public interface JinzhanMapper {
    long countByExample(JinzhanExample example);

    int deleteByExample(JinzhanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jinzhan record);

    int insertSelective(Jinzhan record);

    List<Jinzhan> selectByExample(JinzhanExample example);

    Jinzhan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jinzhan record, @Param("example") JinzhanExample example);

    int updateByExample(@Param("record") Jinzhan record, @Param("example") JinzhanExample example);

    int updateByPrimaryKeySelective(Jinzhan record);

    int updateByPrimaryKey(Jinzhan record);
}