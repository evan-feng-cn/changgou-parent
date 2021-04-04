package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.changgou.entity.SuperEntitySnow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/****
 * @Author:admin
 * @Description:Brand构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Brand",value = "Brand")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_brand")
public class Brand extends SuperEntitySnow<Long> {

	@ApiModelProperty(value = "品牌名称",required = false)
    @TableField(value = "name")
	private String name;//品牌名称
	@ApiModelProperty(value = "品牌图片地址",required = false)
    @TableField(value = "image")
	private String image;//品牌图片地址
	@ApiModelProperty(value = "品牌的首字母",required = false)
    @TableField(value = "letter")
	private String letter;//品牌的首字母
	@ApiModelProperty(value = "排序",required = false)
    @TableField(value = "seq")
	private Integer seq;//排序


}
