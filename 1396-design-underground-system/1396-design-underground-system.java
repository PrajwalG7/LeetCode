class UndergroundSystem {
    
    Map<Integer, String> checkinMap;
    Map<String, Double> travelMap;
    Map<String, Double> countMap;

    public UndergroundSystem() {
        checkinMap = new HashMap<>();
		travelMap = new HashMap<>();
		countMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkinMap.put(id, stationName+"-"+t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        String checkinInfo = checkinMap.get(id);
        String start = checkinInfo.split("-")[0];
        int startTime = Integer.valueOf(checkinInfo.split("-")[1]);
        
        String stationPair = start+"-"+stationName;
        travelMap.put(stationPair,travelMap.getOrDefault(stationPair, 0.0)+(t-startTime));
        countMap.put(stationPair, countMap.getOrDefault(stationPair, 0.0)+1);
        checkinMap.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        
        String stationPair = startStation+"-"+endStation;
        double res = travelMap.get(stationPair)/countMap.get(stationPair);
        return res;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */