import javafx.application.Application
import testapp.treeview
import tornadofx.App
import tornadofx.dumpStylesheets
import tornadofx.reloadStylesheetsOnFocus
import tornadofx.reloadViewsOnFocus

class app:App(treeview::class) {
    init {
        reloadViewsOnFocus()
        reloadStylesheetsOnFocus()
        dumpStylesheets()
    }
}

fun main() {
    Application.launch(app::class.java)
}