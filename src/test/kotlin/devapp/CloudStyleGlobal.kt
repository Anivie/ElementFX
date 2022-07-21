package devapp

import javafx.scene.Cursor.HAND
import javafx.scene.paint.Color
import javafx.scene.paint.Color.*
import javafx.scene.paint.Paint
import javafx.scene.text.FontWeight
import tornadofx.*

class CloudStyleGlobal:Stylesheet() {
    companion object{
        val selectionBar by cssproperty<MultiValue<Paint>>("-fx-selection-bar")
        val selectionBarNonFocused by cssproperty<MultiValue<Paint>>("-fx-selection-bar-non-focused")
    }

    init {
        val blueBorderColor = box(c(193, 197, 205))
        val blueBorderColorFocus = box(c(50, 150, 255))

        button {
            backgroundColor += c(236,245,255)
            backgroundRadius += box(5.px)
            borderColor += box(c(179,216,255))
            borderRadius += box(5.px)
            textFill = c(64,158,255)

            and(hover) {
                backgroundColor += c(64,158,255)
                borderColor += box(c(64,158,255))
                textFill = WHITE
            }

            and(pressed) {
                backgroundColor += c(58,142,230)
                borderColor += box(c(58,142,230))
                textFill = WHITE
            }

            fontSize = 15.px
            padding = box(5.px,10.px)
            cursor = HAND
        }

        textField {
            borderRadius += box(5.px)
            borderColor += blueBorderColor
            borderWidth += box(1.3.px)

            accentColor = c(46,188,232)

            backgroundColor += WHITE
            padding = box(5.px,3.px)
            fontSize = 14.px

            and(focused) {
                borderColor += blueBorderColorFocus
            }
        }

        listView {
            listCell {
                and(odd) {
                    backgroundColor += WHITE
                }
                and(hover) {
                    backgroundColor += c(245,247,250)
                }

                backgroundColor += WHITE

                fontSize = 15.px
                textFill = c(117,117,117)

                padding = box(10.px,0.px,10.px,5.px)
                borderColor += box(TRANSPARENT,TRANSPARENT,c(235,238,245),TRANSPARENT)
            }

            and(focused) {
                listCell {
                    and(selected) {
                        backgroundColor += c(236,245,255)
                        textFill = c(117,117,117)
                    }
                }
            }

            scrollBar {
                decrementArrow {
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }
                incrementArrow{
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }
                decrementButton{
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }
                incrementButton{
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }

                and(vertical) {
                    padding = box(0.px)
                    prefWidth = 9.px
                    backgroundColor += WHITE

                    thumb{
                        backgroundColor += c(221,222,224)
                        backgroundInsets += box(0.px)
                        backgroundRadius += box(5.px)

                        and(pressed) {
                            backgroundColor += c(199,201,204)
                        }
                    }
                }
            }

            and(focused) {
                borderColor += blueBorderColorFocus
            }

            borderColor += blueBorderColor
            borderWidth += box(1.px)

            backgroundInsets += box(0.px)
        }

        textArea {
            content {
                backgroundColor += WHITE
            }
            borderRadius += box(5.px)
            borderColor += blueBorderColor
            borderWidth += box(1.3.px)

            accentColor = c("2EBCE8")

            backgroundColor += WHITE
            padding = box(5.px,3.px)
            fontSize = 17.px

            and(focused) {
                borderColor += blueBorderColorFocus
            }

            scrollBar {
                decrementArrow {
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }
                incrementArrow{
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }
                decrementButton{
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }
                incrementButton{
                    minWidth = 0.px
                    minHeight = 0.px
                    prefWidth = 0.px
                    prefHeight = 0.px
                    visibility= FXVisibility.HIDDEN
                }

                and(vertical, horizontal) {
                    padding = box(0.px)
                    prefWidth = 9.px
                    backgroundColor += WHITE

                    thumb{
                        backgroundColor += c(236,245,255)
                        backgroundInsets += box(0.px)
                        backgroundRadius += box(0.px)

                        and(pressed) {
                            backgroundColor += c(124,188,255)
                        }
                    }
                }
            }
        }

        label {
            fontSize = 13.px
            textFill = c(117,117,117)
        }

        comboBox {
            backgroundColor += WHITE

            borderColor += blueBorderColor
            borderRadius += box(5.px)

            cursor = HAND

            child(listCell) {
                fontSize = 17.px
            }

            child(arrowButton) {
                child(arrow) {
                    shape = "M460.8 755.2a26.112 26.112 0 0 1-18.944-8.704L97.792 363.008a25.6 25.6 0 1 1 37.888-34.304L460.8 691.2l326.656-363.008a25.6 25.6 0 0 1 37.888 34.304L481.28 747.008a26.112 26.112 0 0 1-20.48 8.192z"
                    backgroundColor += c(220,223,230)
                    prefHeight = 5.px
                    prefWidth = 10.px
                }
            }

            child(comboBoxPopup) {
                listView {
                    listCell {
                        and(hover) {
                            backgroundColor += c(245,247,250)
                        }

                        and(selected) {
                            textFill = c(64,158,254)
                            backgroundColor += c(245,247,250)
                        }

                        backgroundColor += WHITE
                        textFill = c(0,0,0,0.5)
                        fontSize = 17.px
                        cursor = HAND
                    }
                    borderColor += box(c(228,231,237))
                }

                scrollBar {
                    decrementArrow {
                        minWidth = 0.px
                        minHeight = 0.px
                        prefWidth = 0.px
                        prefHeight = 0.px
                        visibility= FXVisibility.HIDDEN
                    }
                    incrementArrow{
                        minWidth = 0.px
                        minHeight = 0.px
                        prefWidth = 0.px
                        prefHeight = 0.px
                        visibility= FXVisibility.HIDDEN
                    }
                    decrementButton{
                        minWidth = 0.px
                        minHeight = 0.px
                        prefWidth = 0.px
                        prefHeight = 0.px
                        visibility= FXVisibility.HIDDEN
                    }
                    incrementButton{
                        minWidth = 0.px
                        minHeight = 0.px
                        prefWidth = 0.px
                        prefHeight = 0.px
                        visibility= FXVisibility.HIDDEN
                    }

                    and(vertical) {
                        padding = box(0.px)
                        prefWidth = 9.px
                        backgroundColor += WHITE

                        thumb{
                            backgroundColor += c(236,245,255)
                            backgroundInsets += box(0.px)
                            backgroundRadius += box(0.px)

                            and(pressed) {
                                backgroundColor += c(124,188,255)
                            }
                        }
                    }
                }
            }

            and(focused) {
                borderColor += blueBorderColorFocus
            }
        }

        checkBox {
            box {
                backgroundColor += WHITE
                backgroundRadius += box(3.px)

                borderColor += blueBorderColor
                borderRadius += box(3.px)
            }

            and(selected) {
                box {
                    backgroundColor += c(64,158,255)
                    borderColor += blueBorderColorFocus
                }

                mark {
                    backgroundColor += WHITE
                    shape = "M299,396l2-2,3,3,6-6,2,2-8,8Z"
                }
            }
            fontSize = 14.px
            cursor = HAND
            textFill = c(117,117,117)
        }

        scrollPane {
            viewport {
                backgroundColor += TRANSPARENT
            }
            backgroundColor += TRANSPARENT
        }

        scrollBar {
            decrementArrow {
                minWidth = 0.px
                minHeight = 0.px
                prefWidth = 0.px
                prefHeight = 0.px
                visibility= FXVisibility.HIDDEN
            }
            incrementArrow{
                minWidth = 0.px
                minHeight = 0.px
                prefWidth = 0.px
                prefHeight = 0.px
                visibility= FXVisibility.HIDDEN
            }
            decrementButton{
                minWidth = 0.px
                minHeight = 0.px
                prefWidth = 0.px
                prefHeight = 0.px
                visibility= FXVisibility.HIDDEN
            }
            incrementButton{
                minWidth = 0.px
                minHeight = 0.px
                prefWidth = 0.px
                prefHeight = 0.px
                visibility= FXVisibility.HIDDEN
            }

            and(vertical) {
                padding = box(0.px)
                prefWidth = 9.px
                backgroundColor += WHITE

                thumb{
                    backgroundColor += c(236,245,255)
                    backgroundInsets += box(0.px)
                    backgroundRadius += box(0.px)

                    and(pressed) {
                        backgroundColor += c(124,188,255)
                    }
                }
            }
            and(horizontal) {
                padding = box(0.px)
                prefHeight = 9.px
                backgroundColor += WHITE

                thumb{
                    backgroundColor += c(236,245,255)
                    backgroundInsets += box(0.px)
                    backgroundRadius += box(0.px)

                    and(pressed) {
                        backgroundColor += c(124,188,255)
                    }
                }
            }
        }

        datePicker {
            arrowButton {
                backgroundColor += WHITE
                cursor = HAND

                and(hover, focused) {
                    backgroundColor += c(247, 247, 247)
                }

                child(arrow) {
                    shape = "M896 448H128v447.957333l477.738667 0.021334L896 895.957333V448z m0-42.666667V192.042667C896 192 768 192 768 192V149.333333h128.042667A42.666667 42.666667 0 0 1 938.666667 192.042667v703.914666A42.624 42.624 0 0 1 896.064 938.666667H127.936A42.666667 42.666667 0 0 1 85.333333 895.957333V192.042667C85.333333 168.469333 104.256 149.333333 127.957333 149.333333H256v42.666667l-128 0.042667V405.333333h768zM298.666667 85.333333h42.666666v170.666667h-42.666666V85.333333z m384 0h42.666666v170.666667h-42.666666V85.333333zM384 149.333333h256v42.666667H384V149.333333z"
                }
            }

            datePickerPopup {
                child(monthYearPane) {
                    spinner {
                        child(button) {
                            cursor = HAND
                            backgroundColor += WHITE
                            borderColor += box(TRANSPARENT)
                        }

                        child(label) {
                            fontWeight = FontWeight.BOLD
                        }
                    }

                    backgroundColor += WHITE
                    borderWidth += box(0.px,0.px,1.px,0.px)
                    borderColor += box(c(217,217,217))
                }

                child(calendarGrid) {
                    backgroundColor += WHITE
                }

                dateCell {
                    and(hover) {
                        backgroundColor += c(245,245,245)
                        textFill = BLACK
                    }
                    and(focused) {
                        backgroundColor += c(24,144,255)
                        textFill = WHITE
                    }

                    backgroundRadius += box(3.px)
                    borderColor += box(TRANSPARENT)
                    cursor = HAND
                }

                nextMonth {
                    and(hover) {
                        backgroundColor += c(245,245,245)
                        textFill = c(217,217,217)
                    }

                    backgroundColor += TRANSPARENT
                    textFill = c(217,217,217)
                }
            }

            textField {
                borderColor += box(TRANSPARENT)
            }

            and(focused) {
                borderColor += box(c(64,169,255))
            }

            borderColor += box(c(217,217,217))
            borderRadius += box(3.px)

            backgroundColor += WHITE
        }

        tableView {
            columnHeader {
                backgroundColor += WHITE
                padding = box(10.px, 5.px, 5.px, 5.px)

                borderColor += box(c(235,238,245))
                borderWidth += box(0.px, 0.5.px)
            }
            filler {
                backgroundColor += WHITE
            }

            tableRowCell {
                and(odd) {
                    backgroundColor += c(250,250,250)
                }

                and(hover) {
                    backgroundColor += c(245,247,250)
                }
                and(selected) {
                    backgroundColor += c(236,245,255)
                    text {
                        fill = BLACK
                    }
                }

                borderColor += box(c(235,238,245))
                borderWidth += box(0.5.px, 0.px)
            }

            tableCell {
                and(selected) {
                    textFill = BLACK
                }

                padding = box(10.px)
                fontSize = 13.px
            }

            selectionBar.value += WHITE
            selectionBarNonFocused.value += WHITE


            and(focused) {
                borderColor += blueBorderColorFocus
            }
            borderColor += blueBorderColor
            borderWidth += box(1.px)

            backgroundInsets += box(0.px)
        }

        spinner {
            incrementArrowButton {
                and(hover) {
                    incrementArrow {
                        backgroundColor += c(64,158,255)
                    }
                }
                incrementArrow {
                    shape = "M887.328477 617.152318 533.951458 267.007553c-0.512619-0.512619-1.216181-0.672598-1.759763-1.152533-0.127295-0.127295-0.159978-0.319957-0.287273-0.447252-12.576374-12.416396-32.831716-12.352748-45.280796 0.192662L136.511544 618.944765c-12.447359 12.576374-12.352748 32.800753 0.192662 45.248112 6.239161 6.175514 14.399785 9.280473 22.527725 9.280473 8.224271 0 16.479505-3.168606 22.720387-9.471415L509.792985 333.185325l332.480043 329.407768c6.239161 6.175514 14.368821 9.280473 22.527725 9.280473 8.255235 0 16.479505-3.168606 22.720387-9.471415C899.968499 649.85674 899.872168 629.599677 887.328477 617.152318z"
                }

                cursor = HAND
                backgroundColor += c(245,247,250)
                borderColor += box(TRANSPARENT, TRANSPARENT, c(220,223,230), c(220,223,230))
            }

            decrementArrowButton {
                and(hover) {
                    decrementArrow {
                        backgroundColor += c(64,158,255)
                    }
                }
                decrementArrow {
                    shape = "M890.335385 330.911222c-12.576374-12.416396-32.800753-12.352748-45.248112 0.192662L517.248327 661.951458 184.831931 332.512727c-12.576374-12.447359-32.800753-12.352748-45.280796 0.192662-12.447359 12.576374-12.352748 32.831716 0.192662 45.280796l353.311652 350.112082c0.543583 0.543583 1.247144 0.672598 1.792447 1.183497 0.127295 0.127295 0.159978 0.287273 0.287273 0.416288 6.239161 6.175514 14.399785 9.280473 22.527725 9.280473 8.224271 0 16.479505-3.168606 22.720387-9.471415l350.112082-353.311652C902.975407 363.615643 902.880796 343.360301 890.335385 330.911222z"
                }

                cursor = HAND
                backgroundColor += c(245,247,250)
                borderColor += box(TRANSPARENT, TRANSPARENT, TRANSPARENT,c(220,223,230))
            }

            textField {
                borderColor += box(WHITE)
            }


            borderColor += box(c(220,223,230))
            borderRadius += box(5.px)

            backgroundInsets += box(0.px)
            backgroundRadius += box(5.px)

            and(hover) {
                borderColor += box(c(192,196,204))
            }
        }

        tabPane {
            tabHeaderBackground {
                backgroundColor += TRANSPARENT
                borderColor += box(c(228,231,237))
                borderWidth += box(0.px, 0.px, 3.px, 0.px)
            }

            and(top) {
                tabHeaderArea {
                    backgroundInsets += box(0.px, 0.px, 1.px, 0.px)
                    padding = box(5.px,2.px,0.px,0.px)
                }
            }

            tab {
                and(selected) {
                    borderColor += box(c(64,158,255))

                    tabLabel {
                        textFill = c(64,158,255)
                    }
                }
                and(hover) {
                    tabLabel {
                        textFill = c(64,158,255)
                    }
                }

                tabLabel {
                    fontSize = 15.px
                }
                focusIndicator {
                    borderWidth += box(0.px)
                }
                padding = box(5.0.px, 16.0.px)

                cursor = HAND

                backgroundColor += TRANSPARENT
                borderWidth += box(0.px, 0.px, 3.px, 0.px)
                borderColor += box(c(228,231,237))
            }

            borderColor += blueBorderColor
            borderRadius += box(5.px)
        }

        pagination {
            leftArrowButton {
                and(hover) {
                    leftArrow {
                        backgroundColor += c(64, 158, 255)
                    }
                }
                leftArrow {
                    shape = "M401.066667 512l302.933333 302.933333-59.733333 59.733334L341.333333 571.733333 281.6 512 341.333333 452.266667l302.933334-302.933334 59.733333 59.733334L401.066667 512z"
                }

                backgroundColor += c(240, 242, 245)
                backgroundInsets += box(0.px)
                borderColor += box(TRANSPARENT)
            }

            rightArrowButton {
                and(hover) {
                    rightArrow {
                        backgroundColor += c(64, 158, 255)
                    }
                    padding = box(0.px)
                }
                rightArrow {
                    shape = "M584.533333 512l-302.933333 302.933333L341.333333 874.666667l302.933334-302.933334 59.733333-59.733333-59.733333-59.733333L341.333333 145.066667 281.6 209.066667l302.933333 302.933333z"
                }

                backgroundColor += c(240, 242, 245)
                backgroundInsets += box(0.px)
                borderColor += box(TRANSPARENT)
            }

            numberButton {
                and(hover) {
                    textFill = c(64,158,255)
                }

                and(selected) {
                    backgroundColor += c(64,158,255)
                    textFill = WHITE
                }
                backgroundColor += c(240, 242, 245)
                backgroundInsets += box(0.px)
                backgroundRadius += box(3.px)

                borderColor += box(TRANSPARENT)
                cursor = HAND
            }
        }

        contextMenu {
            backgroundInsets += box(0.px)

            menuItem {
                and(hover, focused) {
                    backgroundColor += c(238,238,238)
                }

                label {
                    textFill = BLACK
                    padding = box(5.px,100.px,5.px,5.px)
                }
            }
        }

        slider {
            track {
                backgroundColor += c(228,231,237)
            }

            thumb {
                backgroundColor += WHITE
                borderColor += box(c(64,158,255))
                borderRadius += box(1.em)
                cursor = HAND

                and(pressed) {
                    backgroundColor += c(228,231,237)
                }
            }
        }

        progressBar {
            backgroundColor += WHITE
            backgroundInsets += box(0.px)
            padding = box(0.px)

            track {
                backgroundColor += c(235,238,245)
            }

            bar {
                backgroundColor += c(64,158,255)
            }
        }

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

                backgroundColor += WHITE
                textFill = BLACK
                cursor = HAND
            }

            backgroundColor += WHITE
        }
    }
}