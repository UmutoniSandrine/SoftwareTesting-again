/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENTREGISTRATION.Dao;

import STUDENTREGISTRATION.Courses;
import STUDENTREGISTRATION.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author bitwayiki
 */
public class CourseDao {

    public Courses addCourse(Courses cr) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(cr);
        s.getTransaction().commit();
        s.close();
        return cr;
    }

    public Courses deleteCourse(Courses cr) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(cr);
        s.getTransaction().commit();
        s.close();
        return cr;
    }

    public Courses updateCourse(Courses cr) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(cr);
        s.getTransaction().commit();
        s.close();
        return cr;
    }

    public List<Courses> allCourses() {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("From Courses");
        List<Courses> li = q.list();
        s.close();
        return li;
    }

}
