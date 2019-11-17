package com.epam.sergeev.helpdesk.dao.category;

import com.epam.sergeev.helpdesk.dao.CRUDdaoImpl;
import com.epam.sergeev.helpdesk.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl extends CRUDdaoImpl<Category> implements CategoryDao {

    public CategoryDaoImpl() {
        super(Category.class);
    }
}
