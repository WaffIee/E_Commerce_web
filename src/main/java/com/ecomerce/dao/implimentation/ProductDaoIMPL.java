package com.ecomerce.dao.implimentation;

import com.ecomerce.dao.productDao;
import com.ecomerce.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
//repository , controller , serviced are the same : they scan class and register it in the container
@Transactional
public class ProductDaoIMPL implements productDao {

    @Autowired
    private SessionFactory sessionfactory;

    public void addProduct(Product product) {
        Session session = sessionfactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public List<Product> GetAll() {
        Session session=sessionfactory.getCurrentSession();
        Query q=session.createQuery("from Product");
        List<Product> pros= q.list();
        session.flush();
        return pros;
    }


    public Product GetProduct(String id) {
        Session session=sessionfactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        session.flush();
        return product;
    }
    public void DeleteProduct(String id) {
        Session session= sessionfactory.getCurrentSession();
        session.delete(GetProduct(id));
        session.flush();
    }

}
