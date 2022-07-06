package ink.bluecloud.css

import javafx.scene.control.Button

enum class ElementButton(val style: String) {
    whiteButton("white-button"),
    defaultButton("default-button"),
    greenButton("green-button"),
    grayButton("gray-button"),
    orangeButton("orange-button"),
    redButton("red-button"),
}

fun Button.theme(theme: ElementButton) {
    styleClass += theme.style
}