package com.springvue.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springvue.Entity.Save;
import com.springvue.Service.SaveService;


/**
 * {@link Save}のコントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Controller
public class SaveController {

	/** Serviceインタフェース */
	@Autowired
	SaveService saveService;
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="save", method=RequestMethod.GET)
	public List<Save> getresultjSQLfromSave(){
		return saveService.getresultjSQLfromSave();
	}
}