package com.entity.view;

import com.entity.QiandaominglingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 签到命令
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
@TableName("qiandaomingling")
public class QiandaominglingView  extends QiandaominglingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiandaominglingView(){
	}
 
 	public QiandaominglingView(QiandaominglingEntity qiandaominglingEntity){
 	try {
			BeanUtils.copyProperties(this, qiandaominglingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
