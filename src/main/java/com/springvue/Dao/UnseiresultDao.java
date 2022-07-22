package com.springvue.Dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.springvue.Dao.Repository.DomaRepository;
import com.springvue.Entity.Unseiresult;

/**
 * {@link Unseiresult}のDaoインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */

@DomaRepository
@Dao
public interface UnseiresultDao {
	
	/**
	 * SQL文を呼び出す
	 * @param todayString 今日の日付
	 * @param birthday 誕生日
	 * @return SQL文の結果
	 */
	@Select
	List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday);
	
	/**
	 * @param checkdate 半年前の日付
	 * @param birthday 誕生日
	 * @return SQL文の結果
	 */
	@Select
	List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday);
	
	/**
	 * @param unseiresult エンティティ
	 * @return SQL文の結果
	 */
	@Insert(sqlFile = true)
	int insertResult(Unseiresult unseiresult);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Unseiresult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Unseiresult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Unseiresult entity);
}