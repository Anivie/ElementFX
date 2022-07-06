package ink.bluecloud.css

import javafx.scene.control.TextField

enum class ElementTextField(val style: String) {
    defaultTextField("default-text-field"),
    greenTextField("green-text-field"),
    grayTextField("gray-text-field"),
    orangeTextField("orange-text-field"),
    redTextField("red-text-field"),
}

fun TextField.theme(theme: ElementTextField) {
    styleClass += theme.style
}