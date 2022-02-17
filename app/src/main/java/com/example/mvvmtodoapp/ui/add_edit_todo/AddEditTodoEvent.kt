package com.example.mvvmtodoapp.ui.add_edit_todo

import android.accounts.AuthenticatorDescription

sealed class AddEditTodoEvent {
    data class OnTitleChange(val title: String): AddEditTodoEvent()
    data class OnDescriptionChange(val description: String): AddEditTodoEvent()
    object OnSaveTodoClick: AddEditTodoEvent()
}
