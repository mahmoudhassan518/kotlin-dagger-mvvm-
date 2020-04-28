package com.mahmoud.daggertest.models.custom

class ModelThrowable {
    var throwable: Throwable
    var isDisplayMessage = false
    var isDisplayViewMessage = false

    constructor(
        throwable: Throwable,
        displayMessage: Boolean,
        displayViewMessage: Boolean
    ) {
        this.throwable = throwable
        isDisplayMessage = displayMessage
        isDisplayViewMessage = displayViewMessage
    }

    constructor(
        throwable: String?,
        displayMessage: Boolean,
        displayViewMessage: Boolean
    ) {
        this.throwable = Throwable(throwable)
        isDisplayMessage = displayMessage
        isDisplayViewMessage = displayViewMessage
    }

    constructor(throwable: Throwable, displayMessage: Boolean) {
        this.throwable = throwable
        isDisplayMessage = displayMessage
        isDisplayViewMessage = false
    }

    constructor(throwable: String?, displayMessage: Boolean) {
        this.throwable = Throwable(throwable)
        isDisplayMessage = displayMessage
        isDisplayViewMessage = false
    }

    constructor(throwable: String?) {
        this.throwable = Throwable(throwable)
    }

    constructor(throwable: Throwable) {
        this.throwable = throwable
    }

}