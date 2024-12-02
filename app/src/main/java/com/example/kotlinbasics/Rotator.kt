import java.io.FileWriter
import java.io.IOException

object Rotator {
    @Throws(IOException::class)
    fun scheduler(teams: Array<String>, fw: FileWriter) {
        val numOfTeams = teams.size
        val evenTeams: Array<String?>
        var k = 0
        if (numOfTeams % 2 == 0) {
            evenTeams = arrayOfNulls(numOfTeams - 1)
            k = 0
            while (k < numOfTeams - 1) {
                evenTeams[k] = teams[k + 1]
                k++
            }
        } else {
            evenTeams = arrayOfNulls(numOfTeams)
            k = 0
            while (k < numOfTeams - 1) {
                evenTeams[k] = teams[k + 1]
                k++
            }
            evenTeams[numOfTeams - 1] = "Bye"
        }
        val teamsSize = evenTeams.size //it is even number
        val total = teamsSize + 1 - 1 // rounds needed to complete tournament
        val halfSize = (teamsSize + 1) / 2
        var count = 0
        for (week in total - 1 downTo 0) {
            //println("week " + ++count)
            fw.write("\r\nweek $count\r\n")
            val teamIdx = week % teamsSize
            if (evenTeams[teamIdx] != "Bye") {
                println(teams[0] + " vs. " + evenTeams[teamIdx])
                fw.write(
                    """${teams[0]} vs. ${evenTeams[teamIdx]}
"""
                )
            }
            for (i in 1 until halfSize) {
                val firstTeam = (week + i) % teamsSize
                val secondTeam = (week + teamsSize - i) % teamsSize
                if (evenTeams[firstTeam] != "Bye" && evenTeams[secondTeam] != "Bye") {
                    println(evenTeams[firstTeam] + " vs. " + evenTeams[secondTeam])
                    fw.write(
                        """${evenTeams[firstTeam]} vs. ${evenTeams[secondTeam]}
"""
                    )
                }
            }
            println()
        }
    }
}