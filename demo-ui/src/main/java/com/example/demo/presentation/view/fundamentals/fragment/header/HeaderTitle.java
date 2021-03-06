package com.example.demo.presentation.view.fundamentals.fragment.header;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class HeaderTitle extends Label {

    HeaderTitle(String value) {
        setValue(value);
        addStyleNames(ValoTheme.LABEL_H1, ValoTheme.LABEL_NO_MARGIN);
    }
}
