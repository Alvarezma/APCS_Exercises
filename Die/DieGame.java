class DieGame {
   
    private GroupOfDie[] players = new GroupOfDie[1];

    DieGame (int numOfPlayers, int dieNum, int dieSides) {
        players = new GroupOfDie[numOfPlayers];
        for (int i = 0; i < players.length; i++)   {
            players[i] = new GroupOfDie(dieNum, dieSides);
        }
    }

    public void roll(int currentPlayer)    {
        players[currentPlayer].rollAll();
    }

    public int getPlayerScore(int currentPlayer) {
        return players[currentPlayer].getScore();
    }

    public int getNumberOfPlayers() {
        return players.length;
    }

}