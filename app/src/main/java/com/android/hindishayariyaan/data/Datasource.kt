package com.android.hindishayariyaan.data

import com.android.hindishayariyaan.R
import com.android.hindishayariyaan.model.HindiShayari

class Datasource (){
    fun loadHindiQuotes():List<HindiShayari>{
        return listOf<HindiShayari>(
            HindiShayari(R.string.quote1, R.drawable.image1),
            HindiShayari(R.string.quote2, R.drawable.image2),
            HindiShayari(R.string.quote3, R.drawable.image3),
            HindiShayari(R.string.quote4, R.drawable.image4),
            HindiShayari(R.string.quote5, R.drawable.image5),
            HindiShayari(R.string.quote6, R.drawable.image6),
            HindiShayari(R.string.quote7, R.drawable.image7),
            HindiShayari(R.string.quote8, R.drawable.image8),
            HindiShayari(R.string.quote9, R.drawable.image9),
            HindiShayari(R.string.quote10, R.drawable.image10),
            HindiShayari(R.string.quote11, R.drawable.image11),
            HindiShayari(R.string.quote12, R.drawable.image12),
            HindiShayari(R.string.quote13, R.drawable.image13),
            HindiShayari(R.string.quote14, R.drawable.image14),
            HindiShayari(R.string.quote15, R.drawable.image15),
            HindiShayari(R.string.quote16, R.drawable.image16),
            HindiShayari(R.string.quote17, R.drawable.image17),
            HindiShayari(R.string.quote18, R.drawable.image18),
            HindiShayari(R.string.quote19, R.drawable.image19),
            HindiShayari(R.string.quote20, R.drawable.image20)
        )
    }
}