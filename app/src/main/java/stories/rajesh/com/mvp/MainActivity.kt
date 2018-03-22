package stories.rajesh.com.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import stories.rajesh.com.mvp.model.SignInPresenterIml
import stories.rajesh.com.mvp.presenter.SignInPresenter
import stories.rajesh.com.mvp.view.SigninView

class MainActivity : AppCompatActivity(), SigninView {

    private var signInPresenter: SignInPresenter? = null
    internal var edit_username: EditText? = null
    internal var editpassword: EditText?=null
    internal var btn_signin: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit_username = findViewById(R.id.edit_username)
        editpassword = findViewById(R.id.editpassword)
        btn_signin = findViewById(R.id.button_sigin)
        signInPresenter = SignInPresenterIml(this@MainActivity)
        btn_signin?.setOnClickListener { signInPresenter!!.sigin(edit_username?.text.toString(), editpassword?.text.toString()) }


    }

    override fun showValidationError() {
        Toast.makeText(this, "validation error", Toast.LENGTH_SHORT).show()
    }

    override fun signInSuccess() {
        Toast.makeText(this, "Sigin success", Toast.LENGTH_SHORT).show()

    }

    override fun signInError() {
        Toast.makeText(this, "Sign Failure", Toast.LENGTH_SHORT).show()
    }
}
