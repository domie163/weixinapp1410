package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuqinqingkuangDao;
import com.entity.ChuqinqingkuangEntity;
import com.service.ChuqinqingkuangService;
import com.entity.vo.ChuqinqingkuangVO;
import com.entity.view.ChuqinqingkuangView;

@Service("chuqinqingkuangService")
public class ChuqinqingkuangServiceImpl extends ServiceImpl<ChuqinqingkuangDao, ChuqinqingkuangEntity> implements ChuqinqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuqinqingkuangEntity> page = this.selectPage(
                new Query<ChuqinqingkuangEntity>(params).getPage(),
                new EntityWrapper<ChuqinqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuqinqingkuangEntity> wrapper) {
		  Page<ChuqinqingkuangView> page =new Query<ChuqinqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuqinqingkuangVO> selectListVO(Wrapper<ChuqinqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuqinqingkuangVO selectVO(Wrapper<ChuqinqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuqinqingkuangView> selectListView(Wrapper<ChuqinqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuqinqingkuangView selectView(Wrapper<ChuqinqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
