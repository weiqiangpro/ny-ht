package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Zixun;
import qt.bean.ZixunExample;

public interface ZixunMapper {
    long countByExample(ZixunExample example);

    int deleteByExample(ZixunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zixun record);

    int insertSelective(Zixun record);

    List<Zixun> selectByExample(ZixunExample example);

    Zixun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zixun record, @Param("example") ZixunExample example);

    int updateByExample(@Param("record") Zixun record, @Param("example") ZixunExample example);

    int updateByPrimaryKeySelective(Zixun record);

    int updateByPrimaryKey(Zixun record);
}