package com.wordpress.chhaichivon.ui.panels.users;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/16/2017
 * TIME   : 11:36 PM
 */
@UIScope
@SpringView(name = UserPanel.NAME)
public class UserPanel extends VerticalLayout implements View {
        public  static  final String NAME = "user.panel";

    @PostConstruct
    void init() {
        setMargin(true);
        setSpacing(true);
        addComponent(new UserFormPanel());
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
