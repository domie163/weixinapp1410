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


import com.dao.QiandaominglingDao;
import com.entity.QiandaominglingEntity;
import com.service.QiandaominglingService;
import com.entity.vo.QiandaominglingVO;
import com.entity.view.QiandaominglingView;

@Service("qiandaominglingService")
public class QiandaominglingServiceImpl extends ServiceImpl<QiandaominglingDao, QiandaominglingEntity> implements QiandaominglingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandaominglingEntity> page = this.selectPage(
                new Query<QiandaominglingEntity>(params).getPage(),
                new EntityWrapper<QiandaominglingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandaominglingEntity> wrapper) {
		  Page<QiandaominglingView> page =new Query<QiandaominglingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiandaominglingVO> selectListVO(Wrapper<QiandaominglingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiandaominglingVO selectVO(Wrapper<QiandaominglingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiandaominglingView> selectListView(Wrapper<QiandaominglingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiandaominglingView selectView(Wrapper<QiandaominglingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
