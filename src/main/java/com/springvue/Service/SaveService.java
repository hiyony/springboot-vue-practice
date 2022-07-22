package com.springvue.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springvue.Entity.Save;


/**
 * {@link Save}のサービスインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Service
public interface SaveService {

	/**
	 * saveテーブルにアクセスするメソッド
	 * @return SQL文の結果
	 */
	public List<Save> getresultjSQLfromSave();

}
