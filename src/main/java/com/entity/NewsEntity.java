package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 新闻信息
 *
 * @author 
 * @email
 */
@TableName("news")
public class NewsEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NewsEntity() {

	}

	public NewsEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 媒体
     */
    @TableField(value = "meiti_id")

    private Integer meitiId;


    /**
     * 新闻标题
     */
    @TableField(value = "news_name")

    private String newsName;


    /**
     * 新闻类型
     */
    @TableField(value = "news_types")

    private Integer newsTypes;


    /**
     * 新闻图片
     */
    @TableField(value = "news_photo")

    private String newsPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 新闻审核
     */
    @TableField(value = "news_yesno_types")

    private Integer newsYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "news_yesno_text")

    private String newsYesnoText;


    /**
     * 新闻详情
     */
    @TableField(value = "news_content")

    private String newsContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：媒体
	 */
    public Integer getMeitiId() {
        return meitiId;
    }
    /**
	 * 获取：媒体
	 */

    public void setMeitiId(Integer meitiId) {
        this.meitiId = meitiId;
    }
    /**
	 * 设置：新闻标题
	 */
    public String getNewsName() {
        return newsName;
    }
    /**
	 * 获取：新闻标题
	 */

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }
    /**
	 * 设置：新闻类型
	 */
    public Integer getNewsTypes() {
        return newsTypes;
    }
    /**
	 * 获取：新闻类型
	 */

    public void setNewsTypes(Integer newsTypes) {
        this.newsTypes = newsTypes;
    }
    /**
	 * 设置：新闻图片
	 */
    public String getNewsPhoto() {
        return newsPhoto;
    }
    /**
	 * 获取：新闻图片
	 */

    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：新闻审核
	 */
    public Integer getNewsYesnoTypes() {
        return newsYesnoTypes;
    }
    /**
	 * 获取：新闻审核
	 */

    public void setNewsYesnoTypes(Integer newsYesnoTypes) {
        this.newsYesnoTypes = newsYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getNewsYesnoText() {
        return newsYesnoText;
    }
    /**
	 * 获取：审核结果
	 */

    public void setNewsYesnoText(String newsYesnoText) {
        this.newsYesnoText = newsYesnoText;
    }
    /**
	 * 设置：新闻详情
	 */
    public String getNewsContent() {
        return newsContent;
    }
    /**
	 * 获取：新闻详情
	 */

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "News{" +
            "id=" + id +
            ", meitiId=" + meitiId +
            ", newsName=" + newsName +
            ", newsTypes=" + newsTypes +
            ", newsPhoto=" + newsPhoto +
            ", insertTime=" + insertTime +
            ", newsYesnoTypes=" + newsYesnoTypes +
            ", newsYesnoText=" + newsYesnoText +
            ", newsContent=" + newsContent +
            ", createTime=" + createTime +
        "}";
    }
}