/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mycompany.greenbuildingmeter.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This data class defines a Mars photo which includes an ID, and the image URL.
 */
@Serializable
data class Building(
    val name: String,
    val city: String?,
    val p01: String?,
    val p02: String?,
    val p03: String?,
    val p04: String?,
    val p05: String?,
    val p06: String?,
    val p07: String?,
    val p08: String?,
    val p09: String?,
    val p10: String?,
    val p11: String?,
    val p12: String?,
    val p13: String?,
    val p14: String?,
    val p15: String?,
    val p16: String?,
    val p17: String?,
    val p18: String?,
    val p19: String?,
    val p20: String?,
    val p21: String?,
    val p22: String?,
    val p23: String?,
    val p24: String?,
    val p25: String?,
    val p26: String?,
    val p27: String?,
    val p28: String?,
    val p29: String?,
    val p30: String?,
    val p31: String?,
    val p32: String?,
    val p33: Float?,
    val p34: Int?,
    val p35: String?,
    val p36: String?,
    val p37: String?,
    val p38: String?,
    val p39: String?,
    val p40: String?,
    val p41: String?,
    val p42: String?,
    val p43: String?,
    val p44: String?,
    val p45: String?,
    val p46: String?,
    val p47: String?,
    val p48: String?,
    val p49: String?,
    val p50: String?,
    @SerialName("p51_1")
    val p511: Float,
    @SerialName("p51_2")
    val p512: Float,
    @SerialName("p51_3")
    val p513: Float,
    @SerialName("p51_4")
    val p514: Float,
    @SerialName("p51_5")
    val p515: Float,
    @SerialName("p51_6")
    val p516: Float,
    val p52: String?,
    val p53: String?,
    val p54: String?,
    val p55: String?,
    val p56: String?,
    val p57: String?,
    val p58: String?,
    val p59: String?,
    val p60: String?,
    @SerialName("p61_1")
    val p611: Float,
    @SerialName("p61_2")
    val p612: Float,
    @SerialName("p61_3")
    val p613: Float,
    @SerialName("p61_4")
    val p614: Float,
    @SerialName("p61_5")
    val p615: Float,
    @SerialName("p61_6")
    val p616: Float,
    val p62: String?,
    val p63: Float,
    val p64: String?,
    val p65: String?,
    val p66: String?,
    @SerialName("p67_1")
    val p671: Float,
    @SerialName("p67_2")
    val p672: Float,
    @SerialName("p68_1")
    val p681: Float,
    @SerialName("p68_2")
    val p682: Float,
    @SerialName("p68_3")
    val p683: Float,
    @SerialName("p68_4")
    val p684: Float,
    @SerialName("p68_5")
    val p685: Float,
    @SerialName("p68_6")
    val p686: Float,
    val p69: Float,
    val p70: String?,
    val p71: String?,
    val p72: Float,
    val p73: Float,
    val p74: String?,
    val p75: String?,
    val p76: String?,
    val p77: String?,
    val p78: String?,
    @SerialName("p79_1")
    val p791: Float,
    @SerialName("p79_2")
    val p792: Float,
    @SerialName("p79_3")
    val p793: Float,
    @SerialName("p79_4")
    val p794: Float,
    @SerialName("p79_5")
    val p795: Float,
    @SerialName("p79_6")
    val p796: Float,
    val p80: String?,
    val p81: String?,
    val p82: String?,
    val p83: String?,
    val id: Int?,
    val ax: Float? = 0.toFloat(),
    val bx: Float? = 0.toFloat(),
    val cx: Float? = 0.toFloat(),
    val dx: Float? = 0.toFloat(),
    val performance: Float? = 0.toFloat(),
    val level: String? = null,
    val policy: Float? = 0.toFloat(),
    val retrofit: Float? = 0.toFloat(),
    val construction: Float? = 0.toFloat(),
    val utilization: Float? = 0.toFloat()
)
