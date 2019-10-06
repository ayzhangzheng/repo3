package dao;

import domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {

    //按id查询
    @Select("select * from items where id=#{id}")
    public Items findById(Integer id);
}
