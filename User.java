public class User{

      private String username;
      private int eloPoint;
      private String rank;

      public User(String username){
            this.username = username;
            this.eloPoint = 1000;
            this.rank = calculateRank();
      }

      public String calculateRank(){

            if (this.eloPoint< 1200){
                  rank = "larva";
            }
            else if (this.eloPoint < 1800){
                  rank = "pupa";
            }
            else if (this.eloPoint < 2400){
                  rank = "ladybug";
            }
            else{
                  rank = "grandmaster beetle";
            } 
            return rank;
      }

      public void adjustElo(int points) {
            this.eloPoint += points;
            this.rank = calculateRank();
      }

      public int getElo(){
            return eloPoint;
      }

      public String getUsername(){
            return username;
      }

}