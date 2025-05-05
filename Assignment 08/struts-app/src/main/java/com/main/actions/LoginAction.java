package com.main.actions;

import com.main.forms.LoginForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {

        LoginForm loginForm = (LoginForm) form;

        System.out.println("LoginAction triggered for user: " + loginForm.getName());

        return mapping.findForward("success");
    }
}
