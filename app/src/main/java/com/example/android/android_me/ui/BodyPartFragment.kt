package com.example.android.android_me.ui

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.android_me.R

class BodyPartFragment : Fragment() {


    init{

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_body_part,)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}