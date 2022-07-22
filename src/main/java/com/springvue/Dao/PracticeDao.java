package com.springvue.Dao;

import com.springvue.Entity.Practice;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface PracticeDao {

    /**
     * @param pr1
     * @return the Practice entity
     */
    @Select
    Practice selectById(Integer pr1);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Practice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Practice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Practice entity);
}