package com.epam.sergeev.helpdesk.dao.category;

import com.epam.sergeev.helpdesk.dao.CRUDdao;
import com.epam.sergeev.helpdesk.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends CRUDdao<Category> {
}
