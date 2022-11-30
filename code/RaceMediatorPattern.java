package code;

class RaceMediatorPattern {
    public static void main(String args[]) {
        IRaceMediator raceMediator = new RaceMediator();
        Race nascarRace = new Race(raceMediator);
        Track track1 = new Track(raceMediator);
        raceMediator.registerRace(nascarRace);
        raceMediator.registerTrack(track1);
        nascarRace.getReady();
        track1.pitStop();
        nascarRace.pitStop();
    }
}
