package com.dao;

import com.entity.QiandaominglingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandaominglingVO;
import com.entity.view.QiandaominglingView;


/**
 * 签到命令
 * 
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public interface QiandaominglingDao extends BaseMapper<QiandaominglingEntity> {
	
	List<QiandaominglingVO> selectListVO(@Param("ew") Wrapper<QiandaominglingEntity> wrapper);
	
	QiandaominglingVO selectVO(@Param("ew") Wrapper<QiandaominglingEntity> wrapper);
	
	List<QiandaominglingView> selectListView(@Param("ew") Wrapper<QiandaominglingEntity> wrapper);

	List<QiandaominglingView> selectListView(Pagination page,@Param("ew") Wrapper<QiandaominglingEntity> wrapper);
	
	QiandaominglingView selectView(@Param("ew") Wrapper<QiandaominglingEntity> wrapper);
	

}
