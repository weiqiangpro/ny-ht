package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Xinwen;
import qt.bean.XinwenExample;

public interface XinwenMapper {
    long countByExample(XinwenExample example);

    int deleteByExample(XinwenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xinwen record);

    int insertSelective(Xinwen record);

    List<Xinwen> selectByExample(XinwenExample example);

    Xinwen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xinwen record, @Param("example") XinwenExample example);

    int updateByExample(@Param("record") Xinwen record, @Param("example") XinwenExample example);

    int updateByPrimaryKeySelective(Xinwen record);

    int updateByPrimaryKey(Xinwen record);
}