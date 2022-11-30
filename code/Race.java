package code;

class Race implements Command {
    private IRaceMediator iRaceMediator;

    public Race(IRaceMediator iRaceMediator) {
        this.iRaceMediator = iRaceMediator;
    }

    public void pitStop() {

        if (iRaceMediator.isPitStop()) {
            System.out.println("PitStop Successfully.");
            iRaceMediator.setPitStopStatus(true);
        } else
            System.out.println("Waiting for pitStop.");
    }

    public void getReady()
    {
        System.out.println("Ready for PitStop.");
    }

}
