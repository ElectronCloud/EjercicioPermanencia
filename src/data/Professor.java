/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author jcarrero
 */
public abstract class Professor extends Employee {
    protected String schooll;
    protected String department ;

    public Professor(String schooll, String department, String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
        this.schooll = schooll;
        this.department = department;
    }
    
    
}
