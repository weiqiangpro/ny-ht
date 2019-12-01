package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Wenhua;
import qt.bean.WenhuaExample;

public interface WenhuaMapper {
    long countByExample(WenhuaExample example);

    int deleteByExample(WenhuaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wenhua record);

    int insertSelective(Wenhua record);

    List<Wenhua> selectByExample(WenhuaExample example);

    Wenhua selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wenhua record, @Param("example") WenhuaExample example);

    int updateByExample(@Param("record") Wenhua record, @Param("example") WenhuaExample example);

    int updateByPrimaryKeySelective(Wenhua record);

    int updateByPrimaryKey(Wenhua record);
}