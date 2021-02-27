/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENTREGISTRATION.Dao;

import STUDENTREGISTRATION.NewHibernateUtil;
import STUDENTREGISTRATION.Student;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author bitwayiki
 */
public class StudentDao {

    public Student createStudent(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(st);
        s.getTransaction().commit();
        s.close();
        return st;
    }

    public Student deleteStudent(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(st);
        s.getTransaction().commit();
        s.close();
        return st;
    }

    public Student updateStudent(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(st);
        s.getTransaction().commit();
        s.close();
        return st;
    }

    public List<Student> findAll() {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("From Student");
        List<Student> li = q.list();
        s.close();
        return li;
    }

}
