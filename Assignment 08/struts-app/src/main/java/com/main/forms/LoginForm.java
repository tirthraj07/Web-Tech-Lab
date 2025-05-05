package com.main.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import javax.servlet.http.HttpServletRequest;

public class LoginForm extends ActionForm {
    private String name;
    private String mobile;
    private String email;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (name == null || name.trim().isEmpty()) {
            errors.add("name", new ActionMessage("error.name.required"));
        } else if (!name.matches("^[a-zA-Z\\s]+$")) {
            errors.add("name", new ActionMessage("error.name.invalid"));
        }

        if (mobile == null || mobile.trim().isEmpty()) {
            errors.add("mobile", new ActionMessage("error.mobile.required"));
        } else if (!mobile.matches("^\\d{10}$")) {
            errors.add("mobile", new ActionMessage("error.mobile.invalid"));
        }

        if (email == null || email.trim().isEmpty()) {
            errors.add("email", new ActionMessage("error.email.required"));
        } else if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            errors.add("email", new ActionMessage("error.email.invalid"));
        }

        return errors;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.name = null;
        this.mobile = null;
        this.email = null;
    }
}
