package com.springvue.Dao;

import com.springvue.Entity.SqlParts;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface SqlPartsDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SqlParts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SqlParts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SqlParts entity);
}