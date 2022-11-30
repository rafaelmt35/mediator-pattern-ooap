package code;

interface Command
{
    void pitStop();
}
 
interface IRaceMediator
{
    public void registerTrack(Track Track);
 
    public void registerRace(Race Race);
 
    public boolean isPitStop();
 
    public void setPitStopStatus(boolean status);
}
