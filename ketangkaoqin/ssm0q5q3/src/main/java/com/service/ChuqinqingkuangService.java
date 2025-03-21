package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuqinqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuqinqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinqingkuangView;


/**
 * 出勤情况
 *
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public interface ChuqinqingkuangService extends IService<ChuqinqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuqinqingkuangVO> selectListVO(Wrapper<ChuqinqingkuangEntity> wrapper);
   	
   	ChuqinqingkuangVO selectVO(@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);
   	
   	List<ChuqinqingkuangView> selectListView(Wrapper<ChuqinqingkuangEntity> wrapper);
   	
   	ChuqinqingkuangView selectView(@Param("ew") Wrapper<ChuqinqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuqinqingkuangEntity> wrapper);
   	

}

