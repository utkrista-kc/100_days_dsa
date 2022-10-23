# Time Complexity: O(n) -> Number of competitions
# Space Complexity: O(t) -> Number of teams
def tournamentWinner(competitions, results):
    bestTeam = ''
    resultsDict = {bestTeam: 0}

    for index,value in enumerate(competitions):
        homeTeam, awayTeam = value
        winnerTeam = ''
        winnerTeam = homeTeam if results[index] == 1 else awayTeam
        if winnerTeam not in resultsDict:
                resultsDict[winnerTeam] = 3
        else:
                resultsDict[winnerTeam] += 3
        if resultsDict[winnerTeam] > resultsDict[bestTeam]:
            bestTeam = winnerTeam
    return bestTeam
