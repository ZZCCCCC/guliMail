package com.zzc.gulimail.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzc.common.utils.PageUtils;
import com.zzc.common.utils.Query;

import com.zzc.gulimail.product.dao.CategoryDao;
import com.zzc.gulimail.product.entity.CategoryEntity;
import com.zzc.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查出所有分类
     *
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查出所有的分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2.组装分类
        // 2.1 找到1级分类
        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        //    拿到一级分类
        }).map((menu) -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - ((menu2.getSort() == null) ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }



    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> childrens = all.stream().filter((categoryEntity) -> {
            //拿到二级分类
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            //给二级分类设置子分类
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            //菜单排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return childrens;
    }


    /**
     * 删除菜单
     * @param asList
     */
    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO  检查当前菜单，是否被别的地方引用

        //逻辑删除
        baseMapper.deleteBatchIds(asList);
    }
}