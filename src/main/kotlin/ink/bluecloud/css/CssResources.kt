package ink.bluecloud.css

import javafx.scene.Scene

object CssResources {
    const val globalCssFile = "cloud_css/ElementFX.css"
    const val buttonCssFile = "cloud_css/ElementButton.css"
    const val textFieldCssFile = "cloud_css/ElementTextField.css"
}

fun Scene.themes(block: MutableList<String>.(CssResources) -> Unit) {
    buildList {
        block(CssResources)

        if (indexOf(CssResources.globalCssFile) > 0) {
            this -= CssResources.globalCssFile
            stylesheets += CssResources.globalCssFile
            stylesheets += this
        } else {
            stylesheets += this
        }
    }
}