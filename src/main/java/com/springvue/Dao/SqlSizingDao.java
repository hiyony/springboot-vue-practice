package com.springvue.Dao;

import com.springvue.Entity.SqlSizing;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface SqlSizingDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SqlSizing entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SqlSizing entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SqlSizing entity);
}