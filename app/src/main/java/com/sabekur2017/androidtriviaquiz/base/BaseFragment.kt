package com.sabekur2017.androidtriviaquiz.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import java.util.Timer

abstract class BaseFragment<VM : BaseViewModel, VB : ViewBinding>(
    @LayoutRes contentLayoutId: Int
) : Fragment(contentLayoutId) {

    private var _binding: VB? = null
    protected val binding: VB
        get() = _binding!!

    protected var lazyTimer: Timer? = null

    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = initializeViewBinding(view)
    }

    override fun onDestroyView() {
        if (lazyTimer == null) {
            lazyTimer = null
        }
        _binding = null
        super.onDestroyView()
    }

    protected fun initializeTimer() {
        if (lazyTimer == null) {
            lazyTimer = Timer()
        }
    }


    abstract fun initializeViewBinding(view: View): VB


}