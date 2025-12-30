public class Submission {
      private User user;
      private Challenge challenge;
      private String userSolution;
      private boolean isSuccess;

      public Submission(User user, Challenge challenge, String userSolution){
            this.user = user;
            this.challenge = challenge;
            this.userSolution = userSolution;
            this.isSuccess = false;
      }


}

