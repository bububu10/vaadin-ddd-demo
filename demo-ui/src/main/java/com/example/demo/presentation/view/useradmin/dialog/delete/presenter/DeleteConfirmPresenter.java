package com.example.demo.presentation.view.useradmin.dialog.delete.presenter;

import com.example.demo.application.service.user.UserService;
import com.example.demo.domain.model.user.summary.UserSummaries;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
@ViewScope
public class DeleteConfirmPresenter implements IDeleteConfirmPresenter {
    IDeleteConfirmDialog view;

    UserService userService;

    @Autowired
    public DeleteConfirmPresenter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void attachView(IDeleteConfirmDialog view) {
        this.view = view;
    }

    @Override
    public void onClickOkButton(UserSummaries userSummaries) {
        userSummaries.forEach(userSummary -> userService.delete(userSummary.profile().userId()));
        view.returnUserAdminView();
    }

    @Override
    public void onClickCancelButton() {
        view.returnUserAdminView();
    }

}
