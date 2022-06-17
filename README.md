# Hacker-rank problem solving ###

Problem 1

https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

Solution :  
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/MariaBasketball.java

    public static List<Integer> breakingRecords(List<Integer> scores) {
    List<Integer> highestScore = new ArrayList<>();
    List<Integer> lowestScore = new ArrayList<>();
    AtomicInteger highestCount = new AtomicInteger();
    AtomicInteger lowestCount = new AtomicInteger();
        scores.stream().forEach(a->{
            if(highestScore.isEmpty())
                highestScore.add(a);
            if(lowestScore.isEmpty())
                lowestScore.add(a);

            if(a > highestScore.get(highestScore.size()-1)){
                highestCount.getAndIncrement();
                highestScore.add(a);
            }
            if(a < lowestScore.get(lowestScore.size()-1)){
                lowestCount.getAndIncrement();
                lowestScore.add(a);
            }
        });

        return Arrays.asList(highestCount.get(),lowestCount.get());
    }

