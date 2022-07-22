package com.springvue.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springvue.Dao.OmikujiiDao;
import com.springvue.Entity.Omikujii;
import com.springvue.Entity.OmikujiiSave;
import com.springvue.Entity.PercentSave;

/**
 * {@link Omikujii}のサービス処理クラスです。
 * 
 * @author h_kim
 * @version 1.0
 */

@Component
public class OmikujiiServiceImpl implements OmikujiiService{

	/** Dao */
	@Autowired
	private OmikujiiDao omikujiiDao;
	
	/**
	 * omikujiiサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public int countSQLfromOmikujii() {
		return omikujiiDao.countSQLfromOmikujii();
	}
	
	/**
	 * omikujiiサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID) {
		return omikujiiDao.getresultSQLfromOmikujii(omikujiID);
	}
	
	/**
	 * omikujiiサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public List<PercentSave> getPercentResultList(String birthday) {
		return omikujiiDao.getPercentResultList(birthday);
	}
	
}
