import java.time.LocalDate
import java.time.Period

/**
 * Class which represents a student, which stores [firstName], [lastName], [dateOfBirth], [group]
 */
class Student(var firstName: String, var lastName: String) {
    var dateOfBirth: LocalDate = LocalDate.parse("2000-01-01")
    var group: String = "TI-91"

    /**
     * Method to calculate student's age
     * @return Int
     */
    private fun getAge(): Int {
        return Period.between(
            this.dateOfBirth,
            LocalDate.now()
        ).years
    }

    /**
     * Method to set [dateOfBirth]
     * Converts String to LocalDate
     */
    fun setDateOfBirth(dateOfBirth: String) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth)
    }

    /**
     * Override method toString()
     * @return String
     */
    override fun toString(): String {
        return "Name: $firstName $lastName\nGroup: $group\nAge: ${this.getAge()}\n"
    }
}

class University(var name: String = "NTUU KPI", var students: MutableList<Student>) {
    fun addStudent(student: Student) {
        students.add(student)
    }

    fun removeStudent(student: Student) {
        students.remove(student)
    }

    override fun toString(): String {
        return "University $name with ${students.count()} students."
    }
}


fun main() {
    val student1: Student = Student("name1", "lastname1")
    student1.setDateOfBirth("2002-02-02")
    student1.group = "TI-92"
    val student2: Student = Student("name2", "lastname2")
    student2.setDateOfBirth("2002-03-03")
    println(student1.toString())
    val group: University = University(students=mutableListOf(student1, student2))
    println(group.toString())
    group.removeStudent(student2)
    println(group.toString())
}