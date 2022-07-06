package devapp.treeview

import javafx.scene.Cursor
import javafx.scene.paint.Color
import tornadofx.Stylesheet
import tornadofx.c

class TreeClass:Stylesheet() {
    init {
        treeView {
            treeCell {
                and(hover) {
                    backgroundColor += c(245,247,250)
                }
                and (selected) {
                    backgroundColor += c(245,247,250)
                }
                and(empty) {
                    backgroundColor += Color.TRANSPARENT
                }

                treeDisclosureNode {
                    arrow {
                        backgroundColor += c(168,171,178)
                    }
                }

                backgroundColor += Color.WHITE
                textFill = Color.BLACK
                cursor = Cursor.HAND
            }

            backgroundColor += Color.WHITE
        }
    }
}