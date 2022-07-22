package com.springvue.Dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.springvue.Dao.Repository.DomaRepository;
import com.springvue.Entity.Fortunemaster;



/**
 * {@link Fortunemaster}のDaoインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */

@DomaRepository
@Dao
public interface FortunemasterDao {

	/**
	 * SQL文を呼び出す
	 * @return SQL文の結果
	 */
	@Select
	List<Fortunemaster> getSelectSQLfromFortunemaster();
	
	/**
	 * @param fortunemaster 運勢マスター
	 * @return 影響されたロー
	 */
	@Insert(sqlFile=true)
	int insertFortune(Fortunemaster fortunemaster);
	
    /**
     * @param unseicode
     * @return the Fortunemaster entity
     */
    @Select
    Fortunemaster selectById(String unseicode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Fortunemaster entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Fortunemaster entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Fortunemaster entity);
}