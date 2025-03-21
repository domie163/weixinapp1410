package com.dao;

import com.entity.ChuqinqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuqinqingkuangVO;
import com.entity.view.ChuqinqingkuangView;


/**
 * 出勤情况
 * 
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public interface ChuqinqingkuangDao extends BaseMapper<ChuqinqingkuangEntity> {
	
	List<ChuqinqingkuangVO> selectListVO(@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);
	
	ChuqinqingkuangVO selectVO(@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);
	
	List<ChuqinqingkuangView> selectListView(@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);

	List<ChuqinqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);
	
	ChuqinqingkuangView selectView(@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);
	

}
