package com.admedia.thirdpartylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task

class Sample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
    }
}

/*
private fun signIn(){
    */
/*val signInIntent = gsc.signInIntent
    startActivityForResult(signInIntent, 1000)*//*


    val account = GoogleSignIn.getLastSignedInAccount(this)
    val signInIntent = mGoogleSignInClient.signInIntent
    startActivityForResult(signInIntent, MainActivity.RC_SIGN_IN)

}

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    */
/*if (requestCode == 1000){
        val task : Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)

        try {
            task.getResult(ApiException::class.java)
            setTexts()
        }catch (e: ApiException){
            toast("Something Went Wrong")
        }
    }*//*

    if (requestCode === MainActivity.RC_SIGN_IN) {
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        handleSignInResult(task)
    }
}

private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
    try {
        val account: GoogleSignInAccount = completedTask.getResult(ApiException::class.java)
        setTexts()
    } catch (e: ApiException) {
        toast("Something Went Wrong")
    }
}

private fun setTexts(){
    var account: GoogleSignInAccount? = GoogleSignIn.getLastSignedInAccount(this)
    if(account != null){
        binding.txtName.text = account.displayName
        binding.txtEmailID.text = account.email
    }
}*/
