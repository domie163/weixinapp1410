package com.entity.view;

import com.entity.ChuqinqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出勤情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
@TableName("chuqinqingkuang")
public class ChuqinqingkuangView  extends ChuqinqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuqinqingkuangView(){
	}
 
 	public ChuqinqingkuangView(ChuqinqingkuangEntity chuqinqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, chuqinqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
