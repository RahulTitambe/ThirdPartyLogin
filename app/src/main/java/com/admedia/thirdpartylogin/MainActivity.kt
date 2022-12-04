package com.admedia.thirdpartylogin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.admedia.thirdpartylogin.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient


class MainActivity : AppCompatActivity(), GoogleApiClient.OnConnectionFailedListener {

    companion object{
        val RC_SIGN_IN = 1000
    }

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        listeners()

    }

    private fun listeners(){

        binding.btnLogin.setOnClickListener {

        }
    }

    private fun toast(text:String){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show()
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
        TODO("Not yet implemented")
    }

}