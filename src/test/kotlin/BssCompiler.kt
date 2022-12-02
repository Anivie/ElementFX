import javafx.css.Stylesheet
import java.io.File

fun main(args: Array<String>) {
/*
    args.forEach {
        val input = File(it)
        Stylesheet.convertToBinary(input, File(input.absolutePath.replace(".css",".bss")))
    }
*/

    File("C:\\Users\\anivi\\OneDrive\\桌面").listFiles().filter { it.extension == "css" }.forEach {
        val input = File(it.absolutePath)
        Stylesheet.convertToBinary(input, File(input.absolutePath.replace(".css",".bss")))
    }
}