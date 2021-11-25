package com.example.cloudsqldemo.dao.impl;

import com.example.cloudsqldemo.dao.UserDao;
import com.example.cloudsqldemo.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public void create(User user) {
        Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
        sessionFactory.getCurrentSession().save(user);
        tx.commit();
    }

    @Override
    public List<User> getAll() {
        List<User> usersList = null;
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from " + User.class.getName());
        usersList = query.list();
        tx.commit();
        session.close();
        return usersList;
    }



}
