package com.dao;

import com.entity.KechengqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengqiandaoVO;
import com.entity.view.KechengqiandaoView;


/**
 * 课程签到
 * 
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public interface KechengqiandaoDao extends BaseMapper<KechengqiandaoEntity> {
	
	List<KechengqiandaoVO> selectListVO(@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
	
	KechengqiandaoVO selectVO(@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
	
	List<KechengqiandaoView> selectListView(@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);

	List<KechengqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
	
	KechengqiandaoView selectView(@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
}
