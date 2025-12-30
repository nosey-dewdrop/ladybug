public class Challenge {

      private String description;
      private String buggyCode;
      private String correctCode;

      public Challenge(String description, String buggyCode, String correctCode){
            this.description = description;
            this.buggyCode = buggyCode;
            this.correctCode = correctCode;
      }

      public boolean checkSolution(String userAttempt) {
            if (userAttempt == null) return false;
            
            // Architecture Note: Normalizing strings to ignore whitespace differences
            String cleanAttempt = userAttempt.trim().replaceAll("\\s+", "");
            String cleanSolution = this.correctCode.trim().replaceAll("\\s+", "");
            
            return cleanAttempt.equals(cleanSolution);
      }

      public String getDescription() { 
            return description; 
      }
}

