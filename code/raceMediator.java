package code;

class RaceMediator implements IRaceMediator {
    private Race Race;
    private Track Track;
    public boolean pitStop;

    public void registerTrack(Track Track) {
        this.Track = Track;

    }

    public void registerRace(Race Race) {
        this.Race = Race;

    }

    public boolean isPitStop() {
        return pitStop;
    }

    @Override
    public void setPitStopStatus(boolean status) {
        pitStop = status;

    }

}