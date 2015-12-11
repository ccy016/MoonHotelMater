package com.gj.administrator.gjerp.domain;

import com.gj.administrator.gjerp.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.gj.administrator.gjerp.dao.EmployeeDao;
import com.gj.administrator.gjerp.dao.UserDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "EMPLOYEE".
 */
public class Employee {

    private Long id;
    /** Not-null value. */
    private String name;
    private int employee_type;
    /** Not-null value. */
    private String gender;
    /** Not-null value. */
    private String telphone;
    /** Not-null value. */
    private String email;
    /** Not-null value. */
    private java.util.Date create_time;
    private Long user_id;
    private String card_type;
    private String card_id;
    private String country;
    private String address;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient EmployeeDao myDao;

    private User user;
    private Long user__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Employee() {
    }

    public Employee(Long id) {
        this.id = id;
    }

    public Employee(Long id, String name, int employee_type, String gender, String telphone, String email, java.util.Date create_time, Long user_id, String card_type, String card_id, String country, String address) {
        this.id = id;
        this.name = name;
        this.employee_type = employee_type;
        this.gender = gender;
        this.telphone = telphone;
        this.email = email;
        this.create_time = create_time;
        this.user_id = user_id;
        this.card_type = card_type;
        this.card_id = card_id;
        this.country = country;
        this.address = address;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getEmployeeDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }

    /** Not-null value. */
    public String getGender() {
        return gender;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** Not-null value. */
    public String getTelphone() {
        return telphone;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /** Not-null value. */
    public String getEmail() {
        return email;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Not-null value. */
    public java.util.Date getCreate_time() {
        return create_time;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCreate_time(java.util.Date create_time) {
        this.create_time = create_time;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /** To-one relationship, resolved on first access. */
    public User getUser() {
        Long __key = this.user_id;
        if (user__resolvedKey == null || !user__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserDao targetDao = daoSession.getUserDao();
            User userNew = targetDao.load(__key);
            synchronized (this) {
                user = userNew;
            	user__resolvedKey = __key;
            }
        }
        return user;
    }

    public void setUser(User user) {
        synchronized (this) {
            this.user = user;
            user_id = user == null ? null : user.getId();
            user__resolvedKey = user_id;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}