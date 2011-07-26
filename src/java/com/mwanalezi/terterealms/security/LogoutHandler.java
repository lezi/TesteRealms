/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mwanalezi.terterealms.security;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Mwanalezi
 */
@ManagedBean
@RequestScoped
public class LogoutHandler {
    public String logout(){
        HttpServletRequest request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        request.getSession().invalidate();
        return "login?faces-redirect=true";
    }
}
