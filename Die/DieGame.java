class DieGame {
   
    private GroupOfDie[] players = new GroupOfDie[1];

    DieGame (int numOfPlayers, int dieNum, int dieSides) {
        players = new GroupOfDie[numOfPlayers];
        for (int i = 0; i < players.length; i++)   {
            players[i] = new GroupOfDie(dieNum, dieSides);
        }
    }

    public void roll()    {
        players[2].rollAll();
    }

    public int getPlayerScore() {
        return players[2].getScore();
    }

}