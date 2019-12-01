package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Keyan;
import qt.bean.KeyanExample;

public interface KeyanMapper {
    long countByExample(KeyanExample example);

    int deleteByExample(KeyanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Keyan record);

    int insertSelective(Keyan record);

    List<Keyan> selectByExample(KeyanExample example);

    Keyan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Keyan record, @Param("example") KeyanExample example);

    int updateByExample(@Param("record") Keyan record, @Param("example") KeyanExample example);

    int updateByPrimaryKeySelective(Keyan record);

    int updateByPrimaryKey(Keyan record);
}