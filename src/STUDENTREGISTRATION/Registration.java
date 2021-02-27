/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENTREGISTRATION;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author bitwayiki
 */
@Entity
public class Registration {
    @Id
 private String studentId;
 private String courseId;
 private String studentFaculty;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }
 
 
    
}
