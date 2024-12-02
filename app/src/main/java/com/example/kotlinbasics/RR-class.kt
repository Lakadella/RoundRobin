import java.io.File
import java.io.FileNotFoundException
import java.io.FileWriter
import java.io.IOException
import java.util.Scanner

object Main {


    val teamArray: Array<String> = arrayOf(
        "Man City", "Arsenal", "Borussia Dortmund", "RB Leizig", "Atletico Madrid", "Club Brugge", "PSV", "Celtic", "Sturm Graz", "Lille", "Sparta Praha", "Benfica"

    )

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val teams = teamArray
        val fw = FileWriter("output.txt")
        Rotator.scheduler(teams, fw)
        fw.close()
    }
}

