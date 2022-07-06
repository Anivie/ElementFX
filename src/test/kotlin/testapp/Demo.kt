package testapp

import ink.bluecloud.css.ElementButton
import ink.bluecloud.css.ElementTextField
import ink.bluecloud.css.theme
import ink.bluecloud.css.themes
import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.Priority
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Demo:Application() {
    override fun start(primaryStage: Stage) {
        val loginButton = Button("Login").apply {
            maxWidth = Double.MAX_VALUE
            theme(ElementButton.greenButton)
        }
        val regButton = Button("Register").apply {
            theme(ElementButton.orangeButton)
        }

        val root = TabPane().apply {
            tabs += Tab("PersonalUser").apply {
                content = VBox(10.0).apply {
                    children +=GridPane().apply {
                        add(Label("Name:"),0,0)
                        add(TextField(),1,0)

                        add(Label("Password:"),0,1)
                        add(TextField(),1,1)


                        add(CheckBox("Remember Password?").apply {
                            isSelected = true
                        },1,2)


                        alignment = Pos.CENTER
                        vgap = 10.0
                        hgap = 5.0
                    }

                    children += HBox(5.0).apply {
                        children += loginButton
                        children += regButton

                        HBox.setHgrow(loginButton,Priority.ALWAYS)
                        HBox.setHgrow(regButton,Priority.NEVER)

                        padding = Insets(0.0,30.0,0.0,30.0)
                        alignment = Pos.CENTER
                    }

                    alignment = Pos.CENTER
                }
            }
            tabs += Tab("BusinessUsers").apply {
                content = VBox().apply {
                    children += TextField().apply {
                        theme(ElementTextField.greenTextField)
                    }
                    children += TextField().apply {
                        theme(ElementTextField.defaultTextField)
                    }
                    children += TextField().apply {
                        theme(ElementTextField.grayTextField)
                    }
                    children += TextField().apply {
                        theme(ElementTextField.orangeTextField)
                    }
                    children += TextField().apply {
                        theme(ElementTextField.redTextField)
                    }
                }
            }

            tabClosingPolicy = TabPane.TabClosingPolicy.UNAVAILABLE
            style = "-fx-background-color:white"
        }

        primaryStage.init(root)
    }

    private fun Stage.init(root: TabPane) {
        scene = Scene(root,400.0,400.0).apply {
            themes {
                this += it.globalCssFile
                this += it.buttonCssFile
                this += it.textFieldCssFile
            }
        }
        title = "Element"
        show()
    }
}

fun main() {
    Application.launch(Demo::class.java)
}
