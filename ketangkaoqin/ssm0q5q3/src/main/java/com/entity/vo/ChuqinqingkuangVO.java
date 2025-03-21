package com.entity.vo;

import com.entity.ChuqinqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 出勤情况
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public class ChuqinqingkuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程类型
	 */
	
	private String kechengleixing;
		
	/**
	 * 出勤人数
	 */
	
	private Integer chuqinrenshu;
		
	/**
	 * 缺勤人数
	 */
	
	private Integer queqinrenshu;
		
	/**
	 * 到课率
	 */
	
	private Float daokelv;
		
	/**
	 * 考勤日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoqinriqi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：课程类型
	 */
	 
	public void setKechengleixing(String kechengleixing) {
		this.kechengleixing = kechengleixing;
	}
	
	/**
	 * 获取：课程类型
	 */
	public String getKechengleixing() {
		return kechengleixing;
	}
				
	
	/**
	 * 设置：出勤人数
	 */
	 
	public void setChuqinrenshu(Integer chuqinrenshu) {
		this.chuqinrenshu = chuqinrenshu;
	}
	
	/**
	 * 获取：出勤人数
	 */
	public Integer getChuqinrenshu() {
		return chuqinrenshu;
	}
				
	
	/**
	 * 设置：缺勤人数
	 */
	 
	public void setQueqinrenshu(Integer queqinrenshu) {
		this.queqinrenshu = queqinrenshu;
	}
	
	/**
	 * 获取：缺勤人数
	 */
	public Integer getQueqinrenshu() {
		return queqinrenshu;
	}
				
	
	/**
	 * 设置：到课率
	 */
	 
	public void setDaokelv(Float daokelv) {
		this.daokelv = daokelv;
	}
	
	/**
	 * 获取：到课率
	 */
	public Float getDaokelv() {
		return daokelv;
	}
				
	
	/**
	 * 设置：考勤日期
	 */
	 
	public void setKaoqinriqi(Date kaoqinriqi) {
		this.kaoqinriqi = kaoqinriqi;
	}
	
	/**
	 * 获取：考勤日期
	 */
	public Date getKaoqinriqi() {
		return kaoqinriqi;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
