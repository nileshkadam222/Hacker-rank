# Hacker-rank problem solving ###

**Problem 1**
https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

**Solution :**
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
---
**Problem 2 : Subarray Division**
https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

**Solution:**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/SubarrayDivision.java

    class Result {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count =0;
        for(int i=0;i<=s.size()-m;i++){
            if(d== s.subList(i,i+m).stream().mapToInt(Integer::intValue).sum()){
                count++;
            }
        }
        return count;
     }
    }
----------------
**Problem 3 : Divisible Sum Pairs**
https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

**Solution :**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/DivisibleSumPairs.java

    class Result {
        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
            // Write your code here
            int counter = 0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int sum = ar.get(i) + ar.get(j);
                    if(sum % k==0){
                        counter++;
                    }
                }
            }
            return counter;
        } 
    }

------------
**Problem 4 :migratoryBirds**
https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true

**Solution:**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/MigratoryBirds.java
   
     class Result {
        public static int migratoryBirds(List<Integer> arr) {
            // Write your code here
            Map<Integer,Integer> hp = new HashMap<>();
    
                    arr.stream().forEach(p->{
                        if(hp.containsKey(p)){
                            hp.put(p,(hp.get(p)+1));
                        }else {
                            hp.put(p,1);
                        }
                    });
    
                    int maxCount =0,res=-1;
                    for(Map.Entry<Integer,Integer> entry : hp.entrySet()){
                        if (maxCount < entry.getValue())
                        {
                            res = entry.getKey();
                            maxCount = entry.getValue();
                        }
                    }
                return res;
        }
    
    }

----
**Problem 5: day of the programmer**
https://www.hackerrank.com/challenges/day-of-the-programmer/problem

**Solution:**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/DayoftheProgrammer.java

    class Result5 {
        public static String dayOfProgrammer(int year) {
            // Write your code here
            if (year < 1918) {
                return year%4==0 ? "12.09."+year : "13.09."+year;
            } else if (year == 1918) {
                return "26.09."+year;
            } else {
                return (year % 4 == 0 && year % 100 != 0)|| year%400 == 0 ? "12.09."+year : "13.09."+year;
             }
----
**Problem 6:Bill Division**
https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

**Solution**

    class Result6 {
        public static void bonAppetit(List<Integer> bill, int k, int b) {
            // Write your code here
            int bActualBill =0;
            for(int i=0;i<bill.size();i++){
                if(i != k){
                    bActualBill+=bill.get(i);
                }
            }
            bActualBill = bActualBill/2;
            if(bActualBill==b){
                System.out.println("Bon Appetit");
            }else{
                System.out.println(b-bActualBill);
            }
    
        }
    
    }
---
**Problem 7: Sales By March**
https://www.hackerrank.com/challenges/sock-merchant/problem

**Solution with HashMap :**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/SalesbyMatch.java

    class Result {
        public static int sockMerchant(int n, List<Integer> ar) {
            // Write your code here
            Map<Integer, Double> salesMap = new HashMap<>();
            ar.stream().forEach(a->{
                if(salesMap.containsKey(a)){
                    double valueCounter = salesMap.get(a);
                    double ans = valueCounter+0.5;
                    salesMap.put(a,valueCounter+0.5);
                }else{
                    salesMap.put(a,0.5);
                }
            });
            int sum = 0;
            for(Map.Entry<Integer,Double> a:salesMap.entrySet()){
                double floerValue = Math.floor(a.getValue());
                    sum +=floerValue;
            }
            return sum;
        }
    
    }

**Solution with set :**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/SalesbyMatchHashSet.java

    class Result {
        public static int sockMerchant(int n, List<Integer> ar) {
            // Write your code here
            HashSet<Integer> salesMap = new HashSet<>();
            AtomicInteger pairCounter = new AtomicInteger();
            ar.stream().forEach(a->{
                if(!salesMap.contains(a)){
                    salesMap.add(a);
                }else{
                    pairCounter.getAndIncrement();
                    salesMap.remove(a);
                }
            });
            return pairCounter.get();
        }
    
    }

---

**Problem 8 : drawing-book  :**
Dhttps://www.hackerrank.com/challenges/drawing-book/problem

**Solution:**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/DrawingBook.java

    class Result { 
        public static int pageCount(int n, int p) {
            // Write your code here
            int fromFront = p/2;
            int fromBack = (n-p)/2;
    
            return Math.min(fromFront,fromBack);
        }
    
    }
---
**Problem 9: counting-valleys**
https://www.hackerrank.com/challenges/counting-valleys/problem

**Solution:**

    class Result {
        public static int countingValleys(int steps, String path) {
            // Write your code here
            int alt =0,valley=0;
            for(int i=0;i<path.length();i++){
                char direction = path.charAt(i);
                if(direction=='U'){
                    alt++;
                    if(alt==0){
                        valley++;
                    }
                }else {
                    alt--;
                }
            }
            return valley;
        }
    
    }

---

**Problem 9: Electronics Shop**
https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

**Solution :**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/ElectronicsShop.java

    public class ElectronicsShop {
    public static void main(String[] args) {
    int[] keyboards = {4},drives={5};
    int b=5;
    System.out.println(getMoneySpent(keyboards,drives,b));
    }
    
        static int getMoneySpent(int[] keyboards, int[] drives, int b) {
            AtomicInteger maxUnderB = new AtomicInteger();
            Arrays.stream(keyboards).forEach(keyboard ->{
                Arrays.stream(drives).forEach(drive->{
                    int sum = keyboard+drive;
                    if(sum<=b && sum > maxUnderB.get()){
                        maxUnderB.set(sum);
                    }
                });
            });
            if (maxUnderB.get()==0){
                return -1;
            }
            return maxUnderB.get();
        }
    }
----
**Problem 10: cats-and-a-mouse**
https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

**Solution :**
https://github.com/nileshkadam222/Hacker-rank/blob/main/src/hacker/rank/java/Algorithms/CatsAndMouse.java

    public class CatsAndMouse {
    
        public static void main(String[] args) {
            System.out.println(catAndMouse(4,2,3));
        }
    
    
        static String catAndMouse(int x, int y, int z) {
            int catAdiff = Math.abs(z-x);
            int catBdiff = Math.abs(z-y);
            return catAdiff==catBdiff?"Mouse C" : (catAdiff < catBdiff) ? "Cat A" :"Cat B";
        }
    }
