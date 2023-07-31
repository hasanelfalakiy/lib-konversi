package com.andihasan7.lib.konversi

import kotlin.math.round

fun Double.round( decimals : Int ) : Double {
		var multiplier = 1.0
		repeat ( decimals ) { multiplier *= 10 }
		return round ( this * multiplier ) / multiplier 
}