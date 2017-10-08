package com.example.demo.presentation.view.useradmin.dialog.register.presenter;

import com.example.demo.domain.model.user.User;

public interface IUserRegisterPresenter {

    void attachView(IUserRegisterDialog view);

    void clickSaveButton(User user);

    void clickCancelButton();
}