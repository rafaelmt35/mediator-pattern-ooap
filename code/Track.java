package code;

class Track implements Command {
    private IRaceMediator iRaceMediator;

    public Track(IRaceMediator iRaceMediator) {
        this.iRaceMediator = iRaceMediator;
        iRaceMediator.setPitStopStatus(true);
    }

    @Override
    public void pitStop() {
        System.out.println("PitStop READY");
        iRaceMediator.setPitStopStatus(true);
    }

}
