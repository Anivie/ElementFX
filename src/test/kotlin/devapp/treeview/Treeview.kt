package devapp.treeview

import devapp.CloudStyleGlobal
import javafx.util.StringConverter
import tornadofx.*

class treeview : View() {
/*
    override val root = stackpane {
        val persons = listOf(
            Person("Mary Hanes", "Marketing"),
            Person("Steve Folley", "Customer Service"),
            Person("John Ramsy", "IT Help Desk"),
            Person("Erlick Foyes", "Customer Service"),
            Person("Erin James", "Marketing"),
            Person("Jacob Mays", "IT Help Desk"),
            Person("Larry Cable", "Customer Service")
        )
        val departments = persons
            .map {
                it.department
            }
            .distinct()
            .map {
                Person(it, "")
            }

        treeview<Person> {
            // Create root item
            root = TreeItem(Person("Departments", ""))

            // Make sure the text in each TreeItem is the name of the Person
            cellFormat { text = it.name }

            // Generate items. Children of the root item will contain departments
            populate { parent ->
                if (parent == root) departments else persons.filter { it.department == parent.value.name }
            }
        }

        addStylesheet(TreeClass::class)
        addStylesheet(CloudStyleGlobal::class)
    }
*/

    override val root = stackpane {
        combobox(values = listOf(Ports(21)).asObservable()) {
            converter = object : StringConverter<Ports>() {
                override fun toString(`object`: Ports?): String {
                    return `object`?.port.toString()
                }

                override fun fromString(string: String?): Ports {
                    return Ports(21)
                }
            }

            isEditable = true
        }
        addStylesheet(CloudStyleGlobal::class)
    }

    data class Ports(val port: Int)

}