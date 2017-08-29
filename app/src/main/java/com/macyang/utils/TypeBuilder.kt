package com.macyang.utils

import android.os.Parcel
import android.os.Parcelable
import com.macyang.net.JDResult
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Created by tengfei.lv on 2017/8/29.
 */
class TypeBuilder(args:Array<Type>?): ParameterizedType {

    var mArgs = args ?: emptyArray()

    override fun getRawType(): Type {
        return JDResult::class.java
    }

    override fun getOwnerType(): Type? {
        return null
    }

    override fun getActualTypeArguments(): Array<Type> {
        return mArgs
    }


}