package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QiandaominglingEntity;
import com.entity.view.QiandaominglingView;

import com.service.QiandaominglingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 签到命令
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
@RestController
@RequestMapping("/qiandaomingling")
public class QiandaominglingController {
    @Autowired
    private QiandaominglingService qiandaominglingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiandaominglingEntity qiandaomingling, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			qiandaomingling.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			qiandaomingling.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiandaominglingEntity> ew = new EntityWrapper<QiandaominglingEntity>();
		PageUtils page = qiandaominglingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiandaomingling), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiandaominglingEntity qiandaomingling, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			qiandaomingling.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			qiandaomingling.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiandaominglingEntity> ew = new EntityWrapper<QiandaominglingEntity>();
		PageUtils page = qiandaominglingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiandaomingling), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiandaominglingEntity qiandaomingling){
       	EntityWrapper<QiandaominglingEntity> ew = new EntityWrapper<QiandaominglingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiandaomingling, "qiandaomingling")); 
        return R.ok().put("data", qiandaominglingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiandaominglingEntity qiandaomingling){
        EntityWrapper< QiandaominglingEntity> ew = new EntityWrapper< QiandaominglingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiandaomingling, "qiandaomingling")); 
		QiandaominglingView qiandaominglingView =  qiandaominglingService.selectView(ew);
		return R.ok("查询签到命令成功").put("data", qiandaominglingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiandaominglingEntity qiandaomingling = qiandaominglingService.selectById(id);
        return R.ok().put("data", qiandaomingling);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiandaominglingEntity qiandaomingling = qiandaominglingService.selectById(id);
        return R.ok().put("data", qiandaomingling);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiandaominglingEntity qiandaomingling, HttpServletRequest request){
    	qiandaomingling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiandaomingling);

        qiandaominglingService.insert(qiandaomingling);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiandaominglingEntity qiandaomingling, HttpServletRequest request){
    	qiandaomingling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiandaomingling);
    	qiandaomingling.setUserid((Long)request.getSession().getAttribute("userId"));

        qiandaominglingService.insert(qiandaomingling);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QiandaominglingEntity qiandaomingling, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiandaomingling);
        qiandaominglingService.updateById(qiandaomingling);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiandaominglingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<QiandaominglingEntity> wrapper = new EntityWrapper<QiandaominglingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = qiandaominglingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
