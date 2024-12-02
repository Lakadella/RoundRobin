package com.example.kotlinbasics

class Team(name: String)

class Match(homeTeam: Team, awayTeam: Team, homeResult: Int, awayResult: Int){


}

fun main() {
    var teamArrayF1 = arrayOf(
        "ENG", "NED", "MEX", "SPA", "FRA", "TYS", "MON", "FIN", "KIN", "KAN",
        "DAN", "JAP", "THA", "AUS", "USA"
    )

    var teamArrayF2 = arrayOf("BAR", "USA", "SPA", "FRA", "EST", "BRA", "ENG", "NOR", "JAP", "NED",
    "IND", "ITA", "PAR", "ARG", "MEX", "TSJ", "BEL")

    var teamArrayF3 = arrayOf("SWE", "ITA", "THA", "BUL", "NOR", "NED", "FRA", "AUS", "MEX", "USA",
    "COL", "POL", "PER", "ØST", "IRL", "TYS", "SPA", "ENG")

    var teamArrayFE = arrayOf("TYS", "ENG", "NZL", "SVE", "POR", "BEL", "FRA", "BRA", "SAF", "NED")

    var currentResult = arrayOf(
        "NED26",
        "MEX18",
        "SPA15",
        "MON12",
        "ENG10",
        "SPA8",
        "ENG6",
        "AUS4",
        "ENG2",
        "JAP1"
    )

    calculateResults(teamArrayF1,currentResult)
}
    fun calculateResults(raceLeague: Array<String>, raceResult:Array<String>){
        var score = 0
        for(team in raceLeague) {
            score = 0
            for (result in raceResult){

                if (result.substring(0, 3) == team)
                    score += result.substring(3).toInt()}
            println("$team $score")

        }
    }



