/*
 * This file is part of lib-konversi.
 *
 * lib-konversi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lib-konversi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with lib-konversi.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.andihasan7.lib.konversi

import kotlin.math.round

fun Double.round( decimals : Int ) : Double {
		var multiplier = 1.0
		repeat ( decimals ) { multiplier *= 10 }
		return round ( this * multiplier ) / multiplier 
}