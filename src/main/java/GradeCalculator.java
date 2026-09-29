public class GradeCalculator {
    // 90+ -> A, 80-89 -> B, 70-79 -> C, 60-69 -> D, <60 -> F
    // score нь 0-100 хязгаараас гарвал IllegalArgumentException шиднэ
    public String letterGrade(double score)
    {
        if (score < 0 || score > 100)
        {
            throw new IllegalArgumentException("Score cannot be less than 0 or more than 100");
        }

        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else return "F";

    }

    // Ирц(10), лаб+бие даалт(40), сорил1(10), сорил2(10), шалгалт(30)-ийн
    // оноонуудаас нийлбэр оноог тооцно. Аль нэг нь СӨРӨГ эсвэл дээд хязгаараасаа хэтэрсэн бол IllegalArgumentException шиднэ.
    public double totalScore(double att, double lab, double quiz1, double quiz2, double exam)
    {
        double[] maxScores = {10, 40, 10, 10, 30};
        double[] scores = {att, lab, quiz1, quiz2, exam};

        double sum = 0;

        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] < 0 || scores[i] > maxScores[i])
            {
                throw new IllegalArgumentException("Score cannot be less than 0 or the max amount");
            }

            sum += scores[i];
        }
        
        return sum;
    }
}
