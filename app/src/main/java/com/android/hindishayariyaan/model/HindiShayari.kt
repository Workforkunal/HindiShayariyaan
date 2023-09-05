package com.android.hindishayariyaan.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class HindiShayari(
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId: Int
)
