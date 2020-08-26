package com.macro.mall.tiny.service;
/**
 * @Classname PmsBrandService
 * @Description TODO
 * @Date 2020/8/25 14:47
 * @Created by wuhaitao
 */

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * Create by wht on
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
