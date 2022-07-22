package com.springvue.Dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.springvue.Dao.Repository.DomaRepository;
import com.springvue.Entity.Omikujii;
import com.springvue.Entity.OmikujiiSave;
import com.springvue.Entity.PercentSave;


/**
 * {@link Omikujii}のDaoインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */

@DomaRepository
@Dao
public interface OmikujiiDao {
	
	/**
	 * SQL文を呼び出す
	 * @return SQL文の結果
	 */
	@Select
	int countSQLfromOmikujii();
	
	/**
	 * @param omikujiID おみくじID
	 * @return SQL文の結果
	 */
	@Select
	List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
	
	/**
	 * @param birthday 誕生日
	 * @return SQL文の結果
	 */
	@Select
	List<PercentSave> getPercentResultList(String birthday);
	
	/**
	 * 
	 * @param omikujii エンティティ
	 * @return 影響されたロー
	 */
	@Insert(sqlFile = true)
	int insertOmikuji(Omikujii omikujii);

    /**
     * @param omikujicode
     * @return the Omikujii entity
     */
    @Select
    Omikujii selectById(String omikujicode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Omikujii entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Omikujii entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Omikujii entity);
}