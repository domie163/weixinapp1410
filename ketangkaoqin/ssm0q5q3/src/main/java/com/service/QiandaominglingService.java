package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandaominglingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandaominglingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandaominglingView;


/**
 * 签到命令
 *
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public interface QiandaominglingService extends IService<QiandaominglingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaominglingVO> selectListVO(Wrapper<QiandaominglingEntity> wrapper);
   	
   	QiandaominglingVO selectVO(@Param("ew") Wrapper<QiandaominglingEntity> wrapper);
   	
   	List<QiandaominglingView> selectListView(Wrapper<QiandaominglingEntity> wrapper);
   	
   	QiandaominglingView selectView(@Param("ew") Wrapper<QiandaominglingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaominglingEntity> wrapper);
   	

}

