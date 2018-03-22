package stories.rajesh.com.mvp.model

import android.text.TextUtils
import android.widget.Toast

import stories.rajesh.com.mvp.presenter.SignInPresenter
import stories.rajesh.com.mvp.view.SigninView

/**
 * Created by Rajesh Kumar on 22-03-2018.
 */

class SignInPresenterIml(private val signinView: SigninView) : SignInPresenter {

    override fun sigin(username: String, password: String) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            signinView.showValidationError()
        } else {

            if (!username.equals("rajesh") || !password.equals("1234")) {
                signinView.signInError()

            } else {
                signinView.signInSuccess()
            }
        }

    }
}
