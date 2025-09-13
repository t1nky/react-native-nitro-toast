package com.margelo.nitro.nitrotoast

import android.content.Context
import android.graphics.Typeface
import androidx.compose.ui.text.font.FontFamily
import com.facebook.react.common.assets.ReactFontManager

fun resolveFontFamilyFromReact(
    context: Context,
    fontFamily: String?,
    fontWeight: Int = Typeface.NORMAL,
): FontFamily =
    try {
        val typeface =
            ReactFontManager.getInstance().getTypeface(
                fontFamily.orEmpty(),
                fontWeight,
                context.assets,
            )
        FontFamily(typeface)
    } catch (e: Exception) {
        e.printStackTrace()
        FontFamily.SansSerif
    }
