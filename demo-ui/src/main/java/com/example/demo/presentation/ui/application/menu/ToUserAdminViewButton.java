package com.example.demo.presentation.ui.application.menu;

import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class ToUserAdminViewButton extends Button {
    final static String ID = "ToUserAdminViewButton";

    ToUserAdminViewButton() {
        setId(ID);
        setCaption(UserAdminView.CAPTION);
        setPrimaryStyleName(ValoTheme.MENU_ITEM);
        addClickListener(event -> getUI().getNavigator().navigateTo(UserAdminView.VIEW_NAME));
    }

    void selected() {
        addStyleName("selected");
    }

    void unselected() {
        removeStyleName("selected");
    }
}
