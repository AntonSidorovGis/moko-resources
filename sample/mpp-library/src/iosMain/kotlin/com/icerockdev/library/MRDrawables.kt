/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package com.icerockdev.library

import dev.icerock.moko.resources.DrawableResource

actual object MRDrawables {
    actual val test_drawable = DrawableResource("test_image") // test_image should be in assets of ios application for now
}
